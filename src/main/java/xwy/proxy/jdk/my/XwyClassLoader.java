package xwy.proxy.jdk.my;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//代码生成，编译，重新动态load到JVM
public class XwyClassLoader extends ClassLoader {

	private File baseDir;
	
	public XwyClassLoader() {
		String basePath = XwyClassLoader.class.getResource("").getPath();
		this.baseDir = new File(basePath);
	}
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		String className = XwyClassLoader.class.getPackage().getName() + "." + name;
		if (baseDir != null) {
			File classFile = new File(baseDir,name.replace("\\.","/")+".class");
			System.out.println(classFile);
			ByteArrayOutputStream outputStream = null ;
			if (classFile.exists()) {
				FileInputStream inputStream = null;
				try {
					inputStream = new FileInputStream(classFile);
					outputStream = new ByteArrayOutputStream();
					byte [] buff = new byte[1024];
					int len;
					while((len = inputStream.read(buff)) != -1) {
						outputStream.write(buff, 0, len);
					}
					return defineClass(className, outputStream.toByteArray(), 0,outputStream.size());
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						classFile.delete();
						inputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					try {
						outputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return null;
	}
}
