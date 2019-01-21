package xwy.prototype.greatSage;

public class TestPrototype {
	
	public static void main(String[] args) {
		TheGreateSage sage = new TheGreateSage();
		sage.change();
		
		/**
		 * 大圣本尊生日是：1547992593247
			克隆大圣的生日是：1547992593247
			大圣本尊和克隆大圣是否为同一个对象：false
			大圣持有的金箍棒和克隆大圣持有的金箍棒是否为同一个：true
		 */
		//跟西游记中描述的不一致
		
		//加上序列化和反序列之后
		/**
		 * 大圣本尊生日是：1548030660684
			克隆大圣的生日是：1548030660709
			大圣本尊和克隆大圣是否为同一个对象：false
			大圣持有的金箍棒和克隆大圣持有的金箍棒是否为同一个：false
		 */
	}

}
