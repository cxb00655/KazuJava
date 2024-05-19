package test1;

public class Sample5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		RytakuTest3 rj1=(int a) -> {
			System.out.println(a+5);
		};
		RytakuTest3 rj2 = a -> System.out.println(a+5);
	}

}

interface RytakuTest3 {
	public void f3(int x);
	//public int f3(int x , int y);  <=これがあると関数型インターフェースにならないのでエラーとなる
}