package samplecollection;

public class Item {

	private String name;
	private int price;
	
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	


	public String getName() {
		return name;
	}



	public int getPrice() {
		return price;
	}



	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return "Item[name="+name + ",price=" + price+"]";
	}

	
	
}
