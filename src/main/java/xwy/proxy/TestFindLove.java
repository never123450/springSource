package xwy.proxy;

public class TestFindLove {
	public static void main(String[] args) throws Throwable {
		//不使用代理，自己去找对象
//		new ZhangSan().findLove();
		
		//使用代理
		try {
			Person obj = (Person)new MeiPo().getInstance(new ZhangSan());
			System.out.println(obj.getClass());//class com.sun.proxy.$Proxy0
			//代理对象的实现原理：
			//1.拿到代理对象的引用，然后获取它的接口
			//2.jdk代理重新生成一个类，同时实现我们给的代理对象所实现的接口
			//3.把被代理对象的引用拿到了
			//4.重新动态生成一个class字节码
			//5.然后编译
//			byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[] {Person.class});
//			FileOutputStream oStream = new FileOutputStream("$Proxy0.class");
//			oStream.write(data);
//			oStream.close();	
			
			obj.findLove();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
