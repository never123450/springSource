package xwy.factory.simpleFactory;

import xwy.factory.Audi;
import xwy.factory.BMW;
import xwy.factory.Benz;
import xwy.factory.Car;

public class SimpleFactory {

	//实现统一管理，专业化的管理
	//如果没有工厂模式，小作坊，没有执行标准的
	//如果买到三无产品（没有标准）
	//卫生监督局工作难度会大大减轻
	
	//中国制造（按人家的标准）
	//中国制造向中国创造改变（技术不是问题，问题是什么？问题是思维）
	//码农是执行标准的人
	//系统架构师，就是制定标准的人
	
	//不止做一个制造者，更要做一个思考着
	public Car getCar(String name) {
		if ("BMW".equalsIgnoreCase(name)) {
			
			//spring中的工厂模式
			//bean，beanFactory（生产bean）
			//单例的bean，被代理过的bean，最原始的bean（原型）
			//List类型的bean，作用域不同的bean
			
			//ifelse非常紊乱，维护困难
			//解耦（松耦合开发）
			return new BMW();
		}else if("Benz".equalsIgnoreCase(name)) {
			return new Benz();
		}else if ("Audi".equalsIgnoreCase(name)) {
			return new Audi();
		}else {
			System.out.println("没有这种车");
			return null;
		}
	}
}
