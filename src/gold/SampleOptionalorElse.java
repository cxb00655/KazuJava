package gold;

import java.util.Optional;

public class SampleOptionalorElse {

	public static void main(String[] args) {
		// Sampleに値が入っていればその値を、なければemptyと表示される。
		Optional<String> sample = Optional.empty();
		System.out.println(sample.orElse("empty"));
		System.out.println(sample.orElseGet(() -> "empty"));
	}

}
