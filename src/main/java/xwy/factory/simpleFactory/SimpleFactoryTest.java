package xwy.factory.simpleFactory;

import xwy.factory.Car;

//对于这个工厂来说（太强大了）
//why?
//这个工厂啥都能干
//编码也是一种艺术（融会贯通）
//艺术来源于生活，要回归到生活
public class SimpleFactoryTest {
	
	public static void main(String[] args) {
		//这就是我们的消费者
		
		Car car = new SimpleFactory().getCar("Audi");
		System.out.println(car.getName());
	}

}
