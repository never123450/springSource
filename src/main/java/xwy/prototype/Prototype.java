package xwy.prototype;

import java.util.ArrayList;

public class Prototype implements Cloneable{

	public ArrayList<String> list = new ArrayList();
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Prototype prototype = null;
		try {
			prototype = (Prototype)super.clone();
			prototype.list = (ArrayList<String>) list.clone();
		} catch (Exception e) {
		}
		
		
		//克隆基于字节码
		//用反射或者循环
		return prototype;
//		return super.clone();
	}
}
