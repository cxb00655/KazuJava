package test5;

import java.util.ArrayList;

public class SampleList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("赤");
		list.set(0, "青");
		list.add("黄");
		list.set(1, "緑");
		
		for(String str : list) {
			System.out.println(str);
		}
		
		// TODO 自動生成されたメソッド・スタブ

	}

}
