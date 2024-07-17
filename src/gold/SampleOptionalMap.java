package gold;

import java.util.Optional;

public class SampleOptionalMap {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Optional<String> sample = Optional.of("test");
		Optional<String> result = sample.map(
				str -> str.toUpperCase());
		System.out.println(sample.get());
		System.out.println(result.get());
		
		
		Optional<String> sample2 = Optional.ofNullable(null);
		Optional<String> result2 = sample2.map(
				str -> str.toUpperCase());
		System.out.println(result2.isEmpty());
		
		
		Optional<String> result3 = sample.flatMap(str -> test(str));
		System.out.println(result3.get());
		
		
		
	}
	
	private static Optional<String> test(String str) {
		return Optional.of(str.toUpperCase());
	}
	

}
