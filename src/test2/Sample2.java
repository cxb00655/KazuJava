package test2;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String[] as = {"あ","い","う"};
		Stream<String> s1 = Arrays.stream(as);
		s1.forEach(System.out::println);
		
		int[] ai = {1,2,3};
		
		
		IntStream s2 = Arrays.stream(ai);
		s2.forEach(System.out::println);
		
	}

}
