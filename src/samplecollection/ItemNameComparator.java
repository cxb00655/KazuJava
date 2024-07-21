package samplecollection;

import java.util.Comparator;

public class ItemNameComparator implements Comparator<Item> {

	@Override
	public int compare(Item a, Item b) {
		// TODO 自動生成されたメソッド・スタブ
		return a.getName().compareTo(b.getName());
	}

}
