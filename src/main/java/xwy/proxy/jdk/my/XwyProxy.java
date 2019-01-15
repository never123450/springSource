package xwy.proxy.jdk.my;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

//生成代理对象的代码
public class XwyProxy {
	
	private static String ln = 	 "\r\n";
	public static Object newProxyInstance(XwyClassLoader classLoader,
			Class<?>[] interfaces,
			XwyInvocationHandler h) {
		//1.生成源代码
		String proxySrc = generateSrc(interfaces[0]);
		
		//2.将生成的源代码输出到磁盘，保存为.java文件
		String filePath = XwyProxy.class.getResource("").getPath();
		File file = new File(filePath + "$Proxy0.java");
		try {
			FileWriter fileWriter = new FileWriter(file);
			System.out.println(filePath);
			fileWriter.write(proxySrc);
			fileWriter.flush();
			fileWriter.close();
		
		//3.编译源代码，并生成.calss文件
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager	 manager = compiler.getStandardFileManager(null, null, null);
		Iterable iterable = manager.getJavaFileObjects(file);
		
		CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
		task.call();	
		manager.close();
		
		//4.将class文件中的内容动态加载到JVM中
		
		//5.返回被代理后的代理对象
		Class proxyClass = classLoader.findClass("$Proxy0");
		Constructor constructor = proxyClass.getConstructor(XwyInvocationHandler.class);
		file.delete();
		return constructor.newInstance(h);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	private static String generateSrc(Class<?> interfaces) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("package xwy.proxy.my;" + ln);
		stringBuffer.append("import java.lang.reflect.Method;" + ln);
		stringBuffer.append("public final class $Proxy0 implements " + 
				interfaces.getName() + "{" + ln);
		stringBuffer.append("XwyInvocationHandler h;" + ln);
		stringBuffer.append("public $Proxy0(XwyInvocationHandler h) {" +ln);
		stringBuffer.append("this.h = h;" + ln);
		stringBuffer.append("}" + ln);
		for(Method method : interfaces.getMethods()) {
			stringBuffer.append("public " + method.getReturnType().getName() + " " +
		    method.getName() +"() throws Throwable {" + ln);
			stringBuffer.append("Method m = null;");
			stringBuffer.append("try{"+ln);
			stringBuffer.append(" m = " + interfaces.getName() + 
					".class.getMethod(\""+method.getName()+"\",new Class[]{});" + ln) ;
			if (!method.getReturnType().getName().equals("void")) {
//				System.out.println("method.getName():"+method.getName().);
//				System.out.println("method.getReturnType():"+method.getReturnType().getName());
//				System.out.println("method.getTypeParameters():"+method.getTypeParameters());
//				System.out.println("method.getClass():"+method.getClass().getName());
//				System.out.println("method.getDefaultValue():"+method.getDefaultValue());
//				stringBuffer.append("return " + method.getReturnType().getName() +";");
		         stringBuffer.append("return (String)  this.h.invoke(this,m,null);" + ln);
			}else {
				stringBuffer.append("this.h.invoke(this,m,null);" + ln);
			}
			
			stringBuffer.append(ln + "}catch(Exception e){e.printStackTrace();}" + ln); 
			if (!method.getReturnType().getName().equals("void")) {
				stringBuffer.append("return null;");
			}
			stringBuffer.append("}" + ln);
		}
		
		stringBuffer.append("}");
		
		return stringBuffer.toString();
	}

}
