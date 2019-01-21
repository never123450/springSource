package xwy.template;

public class Coffee extends Beverage {

	//原料
	@Override
	public void addTheIngredients() {
		System.out.println("将咖啡导入杯中");
	}

	//作料
	@Override
	public void pourInCup() {
		System.out.println("添加牛奶和糖");
	}

}
