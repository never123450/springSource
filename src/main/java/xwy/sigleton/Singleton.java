package xwy.sigleton;

//饿汉式（静态内部类）
//这种写法，即解决安全问题，有解决了性能问题
//这个代码，没有浪费一个字
public class Singleton {

	//1.先声明一个静态内部类,private保证别人不能修改，static保证全局唯一
	private static class LazyLoa {
		//final 为了防止内部误操作
		private static final Singleton 	INSTANCE = new Singleton();
	}
	
	//相当于有一个恶魔人的public的无参构造函数，就是意味着在代码中随时可以new出来
	
	//2.将默认的构造方法私有化
	private Singleton() {}
	
	//不管该class有没有实例化，static静态块总是在calssLoader执行完以后，就加载完毕
	static {
		//静态块中的内容，只能访问静态属性和静态方法
		//只要是静态方法或者属性，直接可以用class的名字就能点进来
		//JVM内存中的静态区，这一块的内容是公共的
	}
	
	//3.同样提供静态方法获取实例
	//final 确保别人不能覆盖
	public static final Singleton getInstance() {
		//方法中的逻辑是要在调用的时候才开始执行的
		//方法中的实现逻辑需要分配内存，也是调用的时候才分配	 
		return LazyLoa.INSTANCE;
	
	}
	
	//我们所写的所有代码，在java反射机制面前都是裸奔的
	//反射机制是可以拿到private修饰的内容的
	//我们可以理解即使加上private也不靠谱（按正常套路出牌，是可以的）
	
	//从类加载到JVM的过程，从上往下，先属性后方法，先静态后动态
}
