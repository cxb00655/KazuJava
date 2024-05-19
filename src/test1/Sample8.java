package test1;

import java.util.function.IntBinaryOperator;

public class Sample8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		IntBinaryOperator i1 =MyTest2::f1;
		System.out.println(i1.applyAsInt(3, 5));
		
		MyTest2 m1 = new MyTest2();
		IntBinaryOperator mu =m1::f2;
		System.out.println(mu.applyAsInt(3, 5));
		
	}

}


class MyTest2{
	public static int f1(int x, int y) {
		return x + y;
	};
	public int f2(int x, int y) {
		return x * y;
	};
}