package xwy.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

//cglib
public class XwyMeiPo implements MethodInterceptor {

	//疑问？
	//好像并么有持有被代理对象的引用
	
	public Object getInstance(Class clazz) throws Exception {
		Enhancer enhancer = new Enhancer();
		// 把父类设置为谁？
		//之一步步就是告诉cglib，生成的子类需要继承哪个父类
		enhancer.setSuperclass(clazz.getClass());
		//设置回调
		enhancer.setCallback(this);
		//第一步，生成源代码
		//第二步，编译成class文件
		//第三步，加载到JVM中，并返回代理对象
		return enhancer.create();
	}

	// 同样是做了字节码重组这样一件事，不需要写接口
	// 对于使用api的用户来说是无感知的
	@Override
	public Object intercept(Object object, Method method, Object[] arg2, MethodProxy proxy) throws Throwable {
		System.out.println("我是媒婆");
		System.out.println("开始进行海选...");
		System.out.println("-----------------");

		//这个引用是用cglib给我们new出来的
		//cglib new出来以后的对象，是被代理对象的子类（继承了我们自己写的那个类）
		//OOP，在new子类之前，实际上默认调用了我们的super()方法
		//new了子类的同时，必须要先new出来父类，这就相当于间接地持有了父类的引用
		//子类重写了父类的所有方法
		//我们改变子类对象的某些属性，是可以间接的操作到父类的属性
		proxy.invokeSuper(object, arg2);
		
		System.out.println("intercept object ：" + object + ",arg2 : " + arg2);
		System.out.println("-----------------");
		System.out.println("如果合适的话就准备办事");

		return null;
	}

}
