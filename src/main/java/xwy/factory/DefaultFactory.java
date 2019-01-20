package xwy.factory;

import xwy.factory.abstractFactory.AbstractFactory;
import xwy.factory.abstractFactory.AudiFactory;

public class DefaultFactory extends AbstractFactory{

	private AudiFactory defaultFactory = new AudiFactory();
	
	public Car getCar() {
		return defaultFactory.getCar();
	}
}
