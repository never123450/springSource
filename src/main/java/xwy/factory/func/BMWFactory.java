package xwy.factory.func;

import xwy.factory.Audi;
import xwy.factory.Benz;
import xwy.factory.Car;

public class BMWFactory implements Factory{

	@Override
	public Car getCar() {
		return new Benz();
	}
	
	

}
