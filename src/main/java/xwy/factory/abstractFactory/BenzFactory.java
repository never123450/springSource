package xwy.factory.abstractFactory;

import xwy.factory.BMW;
import xwy.factory.Car;

public class BenzFactory extends AbstractFactory{

	@Override
	public Car getCar() {
		return new BMW();
	}
	
	

}
