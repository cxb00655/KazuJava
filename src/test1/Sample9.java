package test1;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Sample9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		
		Consumer<Integer> c1=(Integer s)->{
			System.out.println(s);
		};
		
		ar.forEach(c1);
		
		ar.forEach((Integer s)->{
			System.out.println(s);
		});
		
		Consumer<Integer> c2=System.out::println;
		
		ar.forEach(c2);
		
		ar.forEach(System.out::println);
		
		

	}

}
