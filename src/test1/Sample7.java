package test1;

public class Sample7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		MyInter i1 = MathTest::add;
		System.out.println(i1.f1(3,4,5));

		MathTest m1 = new MathTest();
		MyInter mu = m1::mul;
		System.out.println(mu.f1(3,4,5));
	}

}


@FunctionalInterface
interface MyInter{
	public abstract int f1(int a, int b  , int c);
}

class MathTest {
	public static int add(int x, int y  , int z) {
		return x + y + z;
	}
	public int mul(int x, int y  , int z) {
		return x * y * z;
	}
}


