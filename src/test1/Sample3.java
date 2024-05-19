package test1;

public class Sample3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		RyakuTest1 r1 = (int a) -> {
			return a + 5;
		};
		RyakuTest1 r2 = ( a) -> {
			return a + 5;
		};
		RyakuTest1 r3 =  a -> {
			return a + 5;
		};
		RyakuTest1 r4 =  a -> a + 5;
		
	}

}


interface RyakuTest1 {
	public int f(int x);
}