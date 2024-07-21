package samplecollection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class SampleQueue {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("### Queue Sample");
		Queue<String> queue = new ArrayDeque<String>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		queue.add("E");
		queue.stream().forEach(System.out::println);

		System.out.println("### Deque Sample");
		Deque<String> deque = new ArrayDeque<String>();
		deque.addLast("A");
		deque.addLast("B");
		deque.addFirst("C");
		deque.addFirst("D");
		deque.stream().forEach(System.out::println);

		System.out.println("### TreeSet Sample");
		Set<String> set = new TreeSet<>();
		set.add("B");
		set.add("D");
		set.add("A");
		set.add("C");
		set.add("A");
		set.stream().forEach(System.out::println);
		
		System.out.println("### Map key Sample");
		
		Map<String, Integer> map = new HashMap<>();
		map.put("ONE",1);
		map.put("TWO",2);
		map.put("THREE",3);
		
		map.keySet().stream().forEach(key -> {
			System.out.println(map.get(key));
		});
		
		
		System.out.println("### Map key, value Sample");
		
		map.entrySet()
			.stream()
			.forEach((Map.Entry<String, Integer> entry) -> {
				String key = entry.getKey();
				Integer val = entry.getValue();
				System.out.println(key+ ":" + val);
			});
			
		
		
	}

}
