package xwy.prototype;

import java.util.ArrayList;
import java.util.List;

public class ConcretePrototype extends Prototype{
	
	//如果定义上百个属性，怎么办？
	//用循环，用反射，确实可以（反射性能不高）
	//字节码复制，newInstance
	private int  age;
	private String name;
	
	public List<String> list = new ArrayList();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
