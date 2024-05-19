package test1;

public class Sample4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		RytakuTest2 ri1=(int a, int b) -> {
			return a + b;
		};

		RytakuTest2 ri2=(a, b) -> {
			return a + b;
		};	

		RytakuTest2 ri3=(a, b) ->a + b;
		
	}

}

interface RytakuTest2 {
	public int f2(int x , int y);
	//public int f3(int x , int y);  <=これがあると関数型インターフェースにならないのでエラーとなる
}