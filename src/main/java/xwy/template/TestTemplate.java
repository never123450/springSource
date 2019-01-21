package xwy.template;

public class TestTemplate {

	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.create();
		System.out.println("---------");
		
		Tea tea = new Tea();
		tea.create();
		
		//模板模式：执行流程一样，但是中间有些步骤不一样
		//spring JDBC 是模板模式
		//是java规范，各个数据库厂商自己去实现
		/*
		 * 1.加载驱动类DriverManage
		 * 2.建立连接
		 * 3、创建语句集（标准语句集，预处理语句集）
		 * 4.执行语句集
		 * 5.结果集ResultSet 游标
		 * ORM
		 */
	}
}
