package samplecollection;

import java.util.Arrays;
import java.util.List;

public class SampleComparator {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// TODO 自動生成されたメソッド・スタブ
		Item a = new Item("apple",100);
		Item b = new Item("orange",200);
		Item c = new Item("banana",40);
		
		List<Item> list = Arrays.asList(a,b,c);
		list.sort(new ItemNameComparator());
		list.forEach(System.out::println);
		
		list.sort((o1,o2) -> { 
			return o1.getName().compareTo(o2.getName());
		});
		list.forEach(System.out::println);
		
	}

}
