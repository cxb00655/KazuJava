package samplecollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SampleCompare implements Comparable<SampleCompare> {

	private String name;
	private int price;
	
	public SampleCompare(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SampleCompare a = new SampleCompare("apple",100);
		SampleCompare b = new SampleCompare("orange",200);
		SampleCompare c = new SampleCompare("banana",40);
		
		List<SampleCompare> list = Arrays.asList(a,b,c);
		Collections.sort(list);
		list.forEach(System.out::println);
	}



	@Override
	public int compareTo(SampleCompare other) {
		// TODO 自動生成されたメソッド・スタブ
		if (this.price < other.price) return -1;
		if (this.price > other.price) return 1;
		return 0;
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
