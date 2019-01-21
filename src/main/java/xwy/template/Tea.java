package xwy.template;

public class Tea extends Beverage{

	@Override
	public void addTheIngredients() {
		System.out.println("将龙井茶放入杯中");
	}

	@Override
	public void pourInCup() {
		System.out.println("添加蜂蜜");
	}

}
