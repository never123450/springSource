package xwy.factory.func;

import xwy.factory.Audi;
import xwy.factory.Car;

public class AudiFactory implements Factory{

	@Override
	public Car getCar() {
		return new Audi();
	}
	
	

}
