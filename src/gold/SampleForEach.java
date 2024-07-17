package gold;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class SampleForEach {

	public static void main(String[] args) {
		
		// TODO 自動生成されたメソッド・スタブ
		List<Integer> list = List.of(1,2,3,4,5);
		list.forEach(System.out::println);
		
		
		String[] array = {"A","B","C"};
		Stream<String> stream = Arrays.stream(array);
		stream.forEach(System.out::println);
		
		//Hashコードで並べられて表示される。
		Set<String> set = new HashSet<>();
		set.add("E");
		set.add("D");
		set.add("C");
		set.add("B");
		set.add("A");
		Stream<String> stream2 = set.stream();
		stream2.forEach(System.out::println);
		
		System.out.println("filter");	
		//filterのサンプル
		List<Integer> listIn = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		listIn.stream()
		.filter(x -> x > 5)
		.filter(x -> x % 2 ==0)
		.forEach(System.out::println);
		
		System.out.println("distinct");	
		//重複削除
		List<String> list4  =Arrays.asList("A","B","C","A");
		list4.stream().distinct().forEach(System.out::println);

		System.out.println("limit");		
		//５つに絞る
		List<Integer> list5 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list5.stream().limit(5).forEach(System.out::println);

		System.out.println("skip");
		//５つ都バス
		List<Integer> list6 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list6.stream().skip(5).forEach(System.out::println);
		
		//並列処理の時は最初ではなくどれか、
		System.out.println("findAny");
		String[] strs = {"A","B","C"};
		Stream<String> streams = Arrays.stream(strs);
		Optional<String> result = streams.findAny();
		result.ifPresent(System.out::println);
	
		//最初の要素を返す
		System.out.println("findFirst");
		Stream<String> streams2 = Arrays.stream(strs);
		Optional<String> result2 = streams2.findFirst();
		result2.ifPresent(System.out::println);
		
		
		//sorted 引数にComparatorを渡すこともできる。
		System.out.println("sorted");
		List<String> list7  =Arrays.asList("A","B","C","A");
		list7.stream()
		.sorted()
		.forEach(System.out::println);
		
		//map
		System.out.println("map");
		String[] fruits = {"apple","orange","banaa"};
		Arrays
		.stream(fruits)
		.map(f -> f.toUpperCase())
		.forEach(System.out::println);
		
		Arrays
		.stream(fruits)
		.map(f -> f.length())
		.forEach(System.out::println);
		
		//reduce
		System.out.println("reduce");
		List<Integer> list8 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Optional<Integer> resultInt = list8.stream().reduce((a,b) ->  a + b);
		resultInt.ifPresent(System.out::println);
		
		//max
		System.out.println("max");
		
		Optional<Integer> resultInt2 = list8.stream()
				.max((a,b) -> {
				if (a==b) return 0;
				if (a<b) return -1;
				return 1;
				});
		
		resultInt2.ifPresent(System.out::println);
		
		
		
		
	}

}
