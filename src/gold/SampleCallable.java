package gold;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SampleCallable {

	public static void main(String[] args) throws Exception, Exception {
		// TODO 自動生成されたメソッド・スタブ

		ExecutorService exec = Executors.newSingleThreadExecutor();
		List<Future<Boolean>> futures = new ArrayList<>();
		
		for (int i = 0; i < 10 ; i++) {
			futures.add(exec.submit(() -> {
				return new Random().nextInt() % 2 == 0;
			}));
		}
		
		int total=0;
		for (Future<Boolean> future : futures) {
			Boolean result = future.get();
			System.out.println(result);
			if (result) {total++;}
			
		}
		System.out.println("total is " +total);
		
	}

}
