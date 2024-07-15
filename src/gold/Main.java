package gold;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Main {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ForkJoinPool executor = new ForkJoinPool();
		ForkJoinTask<String> result = executor.submit(new Task());
		System.out.println(result.get());

	}
}