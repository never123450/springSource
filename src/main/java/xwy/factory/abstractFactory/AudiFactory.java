package xwy.factory.abstractFactory;

import xwy.factory.Audi;
import xwy.factory.Car;

//具体的业务逻辑
public class AudiFactory extends AbstractFactory{

	@Override
	public Car getCar() {
		return new Audi();
	}

}
