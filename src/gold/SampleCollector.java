package gold;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class SampleCollector implements Collector<String, StringBuilder, String> {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> list = Arrays.asList("A","B","C","D","E");
		
		String result = list.stream().collect(new SampleCollector());
		System.out.println(result);

	}

	@Override
	public Supplier<StringBuilder> supplier() {
		// TODO 自動生成されたメソッド・スタブ
		return  StringBuilder::new;
	}

	@Override
	public BiConsumer<StringBuilder, String> accumulator() {
		// TODO 自動生成されたメソッド・スタブ
		return (builder, str) -> {
			if (builder.length() !=0) {
				builder.append(",");
			}
			builder.append(str);
		};
	}

	@Override
	public BinaryOperator<StringBuilder> combiner() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public Function<StringBuilder, String> finisher() {
		// TODO 自動生成されたメソッド・スタブ
		return builder->builder.toString();
	}

	@Override
	public Set<Characteristics> characteristics() {
		// TODO 自動生成されたメソッド・スタブ
		return EnumSet.noneOf(Characteristics.class);
	}

}
