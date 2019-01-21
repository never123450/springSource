package xwy.prototype.greatSage;

import java.io.Serializable;

public class GoldRigedStaff implements Serializable{

	private float height = 100;
	private float diameter = 10;//直径
	
	//金箍棒长大
	public void grow() {
		this.diameter *= 2;
		this.height  *= 2;
	}
	
	//金箍棒缩小
	public void shrink() {
		this.diameter /= 2;
		this.height  /= 2;
	}
	
}
