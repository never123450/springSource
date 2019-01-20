package xwy.prototype;
import java.util.ArrayList;
import java.util.List;

public class CloneTest {

	public static void main(String[] args) {

		ConcretePrototype concretePrototype = new ConcretePrototype();

		concretePrototype.setAge(900);
		concretePrototype.setName("xwy");
		
		List<String> list = new ArrayList<String>();
		list.add("zd");
		
		concretePrototype.list = (ArrayList<String>) list;
		try {
			//如果定义上百个属性，怎么办？
			//用循环，用反射，确实可以（反射性能不高）
			//字节码复制，newInstance
			//能够直接拷贝其实际内容的数据类型/只支持9种，8大基本类型
			ConcretePrototype copy = (ConcretePrototype) concretePrototype.clone();
			System.out.println(copy.getAge() + "," + copy.getName() + "," +copy.list.size());
			System.out.println(concretePrototype.list == copy.list);
			// System.out.println(copy.getAge());//900
			// System.out.println(concretePrototype == copy);//false
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// 就是有一个现成的对象，这个对象里面有已经设置好的值
		// 当我要新建一个对象，并且要给新建的对象复制，而且赋值内容要和之前的内容一致

	}

}
