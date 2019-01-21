package xwy.template;

//冲饮料
public abstract class Beverage {

	//不能被重写
	public final void create() {
		//1.把水烧开
		boilWater();
		//2.把杯子准备好，把原材料放到杯子中
		pourInCup();
		//3.用水冲泡
		brew();
		//4.添加作料
		addTheIngredients();
	}

	public abstract void addTheIngredients() ;

	private void brew() {
		System.out.println("将开水倒入杯子");
	}

	public abstract void pourInCup() ;

	private void boilWater() {
		System.out.println("烧开水，烧到100度可以起锅了");
	}
}
