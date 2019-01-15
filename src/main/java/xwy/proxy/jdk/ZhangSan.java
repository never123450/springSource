package xwy.proxy.jdk;

public class ZhangSan implements Person {

	private String sex = "女";
	private String name = "小小徐";

	public void findLove() {
		System.out.println("我叫："+this.name+"，性别："+this.sex+"我找对象的要求是：");
		System.out.println("高富帅");
		System.out.println("有房有车");
		System.out.println("身高要求180cm");
		System.out.println("年龄20岁");
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
