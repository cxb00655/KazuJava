package thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SampleNewScheduledThreadPool {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		
		ScheduledExecutorService exec = Executors.newScheduledThreadPool(2);
		exec.scheduleWithFixedDelay(()->{
			System.out.print("A");
		}, 1, 1, TimeUnit.SECONDS);


		exec.scheduleWithFixedDelay(()->{
			System.out.print("B");
		}, 1, 1, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		
		exec.shutdown();
		
		
	}

}
