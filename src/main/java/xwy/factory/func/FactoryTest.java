package xwy.factory.func;

public class FactoryTest {
	
	public static void main(String[] args) {
		//工厂方法模式：各自产品的生产商都拥有各自的工厂
		//生产工艺，生成的高科技程度是不一样的
		
		//需要用户关心	这个产品的经销商
		Factory factory = new AudiFactory();
		System.out.println(factory.getCar());
		
		factory = new BenzFactory();
		System.out.println(factory.getCar());
		
		//增加代码的使用复杂度
		
		//抽象工厂模式
	}

}
