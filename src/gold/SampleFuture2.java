package gold;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SampleFuture2 {

	public static void main(String[] args) throws Exception, ExecutionException {
		// TODO 自動生成されたメソッド・スタブ
		
		ExecutorService exec = Executors.newSingleThreadExecutor();
		Future<String> future = exec.submit(() -> {
		try {
			System.out.println("start");
			Thread.sleep(2000);
			System.out.println("end");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
			
		}
			
			
		}, "finish");
		
		System.out.println(future.get());
	

	}

}
