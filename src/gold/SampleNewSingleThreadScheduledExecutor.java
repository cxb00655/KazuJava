package gold;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SampleNewSingleThreadScheduledExecutor {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
		exec.scheduleAtFixedRate(()-> {
			System.out.println("interupt");
		}, 1,1, TimeUnit.SECONDS);
		
		int count=0;
		while (true) {
			Thread.sleep(100);
			System.out.print(">");
			count++;
			if (count==100) {
				exec.shutdown();
				break;
			}
			
			
		}
		
		
	}

}
 