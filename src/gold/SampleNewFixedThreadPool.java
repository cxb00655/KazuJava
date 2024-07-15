package gold;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleNewFixedThreadPool {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ExecutorService exec = Executors.newFixedThreadPool(3);
		for(int i = 0; i < 5; i++) {
			exec.submit(()-> {
			   System.out.println(Thread.currentThread().getId());
			});
		}
		
		

	}

}
