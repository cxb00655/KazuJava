package gold;

import java.util.Optional;

public class SampleOptionalifPresent {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Optional<String> sample = Optional.of("test");
		sample.ifPresent(str -> System.out.println(str));
		
		sample.ifPresentOrElse(
				str ->  System.out.println(str),
				() -> System.out.println("empty"));
		
		
		Optional<String> sample2 = Optional.empty();
		sample2.ifPresentOrElse(
				str ->  System.out.println(str),
				() -> System.out.println("empty"));
		
	}

}
