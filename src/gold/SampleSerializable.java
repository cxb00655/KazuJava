package gold;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SampleSerializable implements Serializable {

	private String name;
	private int price;
	
	public SampleSerializable(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SampleSerializable [name=" + name + ", price=" + price + "]";
	}

	
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		FileOutputStream fos
		= new FileOutputStream("SampleSerializable.ser");
		ObjectOutputStream out 
		= new ObjectOutputStream(fos);
		try (out) {
			SampleSerializable item = new SampleSerializable("apple", 100);
			out.writeObject(item);
		}
		
		FileInputStream fis
		= new FileInputStream("SampleSerializable.ser");
		ObjectInputStream in 
		= new ObjectInputStream(fis);
		
		try(in) {
			Object obj = in.readObject();
			SampleSerializable item = (SampleSerializable)obj;
			System.out.println(item);
		}
		
		
		

	}

}
