package xwy.factory.func;

import xwy.factory.BMW;
import xwy.factory.Car;

public class BenzFactory implements Factory{

	@Override
	public Car getCar() {
		return new BMW();
	}
	
	

}
