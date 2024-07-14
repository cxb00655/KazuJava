package gold;

public class OuterClassTest {

	
	class Inner {
		public void test() {
			System.out.println("Inner Test");
		}
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new OuterClassTest().new Inner().test();

	}
	
	public static class InnerStatic {
		public void test() {
			System.out.println("InnerStatic Test");
		}
		
	}
	

}
