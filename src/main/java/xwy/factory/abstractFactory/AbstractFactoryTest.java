package xwy.factory.abstractFactory;

import xwy.factory.DefaultFactory;

public class AbstractFactoryTest {
	
	public static void main(String[] args) {
		DefaultFactory factory = new DefaultFactory();
		System.out.println(factory.getCar("Benz"));
	}
	
	//设计模式的经典之处在于解决了编写代码的人和调用代码的人双方的痛处
	//解放我们的双手
	

}