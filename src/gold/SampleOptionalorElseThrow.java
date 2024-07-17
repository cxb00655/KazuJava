package gold;

import java.util.Optional;

public class SampleOptionalorElseThrow {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		Optional<String> sample = Optional.empty();
		
		System.out.println(
				sample.orElseThrow(() -> new Exception()));	
	}

}
