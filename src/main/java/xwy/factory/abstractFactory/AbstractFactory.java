package xwy.factory.abstractFactory;

import xwy.factory.Car;

public abstract class AbstractFactory {
	
	public abstract Car getCar();
	
	//这段代码就是动态配置的功能
	public Car getCar(String name) {
		if ("BMW".equalsIgnoreCase(name)) {
			return new BMWFactory().getCar();
		}else if("Benz".equalsIgnoreCase(name)) {
			return new BenzFactory().getCar();
		}else if ("Audi".equalsIgnoreCase(name)) {
			return new AudiFactory().getCar();
		}else {
			System.out.println("没有这种车");
			return null;
		}
	}

}
