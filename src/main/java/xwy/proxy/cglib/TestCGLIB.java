package xwy.proxy.cglib;

public class TestCGLIB {
	
	public static void main(String[] args) {
		//AOP 解耦（团队开发）
		//变相：三层架构（接偶）
		//如果整个项目就是一个人做完
		//张三接了个私活，客户说1天完成，就不需要解耦
		
		//jdk动态代理是通过接口来进行强制转换的
		//生成以后的代理对象，可以强制转换为接口
		//CGLIB的动态代理是通过生成一个被代理对象的子类，然后重写父类的方法
		//生成以后的对象可以强制转换为被代理对象（也就是用自己写的）
		//子类引用赋值给父类
		
		try {
			Xwy obj = (Xwy)new XwyMeiPo().getInstance(Xwy.class);
//			System.out.println("obj="+obj);
			obj.findLove();
//			Object object = (Xwy)new XwyMeiPo().getInstance(new Xwy());
//			System.out.println("Object= " + object);
//			((Xwy) object).findLove();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
