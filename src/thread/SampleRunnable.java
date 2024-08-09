package thread;

/* Runnableをラムダ式で実装したサンプル */
public class SampleRunnable {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Thread t = new Thread(() -> {
			System.out.println("sub");
		});
		t.start();

		for(int i=0; i < 1; i++) {
			System.out.println("main :" + i);	
		}
		
	}

}
