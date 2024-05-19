package test2;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Sample1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);

		Consumer<Integer> c1 = System.out::println;
		
		Stream<Integer> s1 = a1.stream();
		s1.forEach(c1);
		
		

	}

}
