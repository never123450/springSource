package xwy.prototype.greatSage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

//齐天大圣
public class TheGreateSage extends Monkey implements Cloneable ,Serializable{

	// 金箍棒
	private GoldRigedStaff staff;

	public TheGreateSage() {
		this.staff = new GoldRigedStaff();
		this.birthday = new Date();
		this.heaght = 150;
		this.weight = 30;
	}

	// 分身术
	public Object clone() {
		
		ByteArrayOutputStream byteArrayOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		ByteArrayInputStream byteArrayInputStream = null;
		try {
			// return super.clone();//默认克隆八大基本数据类型和Stirng
			//序列化
			byteArrayOutputStream = new ByteArrayOutputStream();
			objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			objectOutputStream.writeObject(this);

			//反序列化
			byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
			ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
			TheGreateSage copy = (TheGreateSage) objectInputStream.readObject();
			copy.birthday = new Date();
			return copy;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				byteArrayInputStream.close();
				objectOutputStream.close();
				byteArrayInputStream.close();
			} catch (Exception e) {
			}
		}
	}

	// 变化
	public void change() {
		TheGreateSage copySage = (TheGreateSage) clone();
		System.out.println("大圣本尊生日是：" + this.getBirthday().getTime());
		System.out.println("克隆大圣的生日是：" + copySage.getBirthday().getTime());
		System.out.println("大圣本尊和克隆大圣是否为同一个对象：" + (this == copySage));
		System.out.println("大圣持有的金箍棒和克隆大圣持有的金箍棒是否为同一个：" + (this.getStaff() == copySage.getStaff()));

	}

	public GoldRigedStaff getStaff() {
		return staff;
	}

	public void setStaff(GoldRigedStaff staff) {
		this.staff = staff;
	}

}
