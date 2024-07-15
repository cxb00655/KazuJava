package gold;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SampleNewSingleThreadScheduledExecutor2 {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
		exec.schedule(()-> {
			System.out.println("finish");
			exec.shutdown();
		}, 1, TimeUnit.SECONDS);
		
		int count=0;
		while (true) {
			Thread.sleep(100);
			if (exec.isShutdown()) {
				break;
			}
			
			System.out.println((++count) * 100 + "ms");
		}
		
		
	}

}
 