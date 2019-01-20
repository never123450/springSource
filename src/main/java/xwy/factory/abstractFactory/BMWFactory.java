package xwy.factory.abstractFactory;

import xwy.factory.Benz;
import xwy.factory.Car;

public class BMWFactory extends AbstractFactory{

	@Override
	public Car getCar() {
		return new Benz();
	}

}
