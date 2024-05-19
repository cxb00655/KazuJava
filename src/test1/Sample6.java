package test1;


import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

//関数型インターフェース
public class Sample6 {
	public static void main(String[] args) {
		IntBinaryOperator i1 = (int a, int b) -> {
			return a + b;
		};
		
		System.out.println(i1.applyAsInt(3, 5));
		
		IntConsumer c1 = (int a ) -> {
			System.out.println(a+5);
		};
		
		c1.accept(6);
		
		
		IntSupplier s1 = () -> {
			return 10;
		};
		
		System.out.println(s1.getAsInt());
		
		
		Supplier<Person> sp1 = ()->{
			return new Person();
		};
		
		Person p1=sp1.get();
		p1.setName("中川");
		System.out.println(p1.getName());
		
		IntPredicate ip1=(int a)-> {
			return a>5;
		};
		
		
		System.out.println(ip1.test(10));
		System.out.println(ip1.test(1));
		

		
		
		

	}
}


class Person{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
