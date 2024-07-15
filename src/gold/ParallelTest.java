package gold;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ParallelTest {

	public static void main(String[] args) throws Exception {
	    ExecutorService es = Executors.newFixedThreadPool(2);
	    try {
	        es.execute(() -> System.out.println("executor:1, thread-id:" + Thread.currentThread().getId()));
	        es.execute(() -> System.out.println("executor:2, thread-id:" + Thread.currentThread().getId()));
	        es.execute(() -> System.out.println("executor:3, thread-id:" + Thread.currentThread().getId()));
	        es.execute(() -> System.out.println("executor:4, thread-id:" + Thread.currentThread().getId()));
	        es.execute(() -> System.out.println("executor:5, thread-id:" + Thread.currentThread().getId()));
	    } finally {
	        es.shutdown();
	        es.awaitTermination(1, TimeUnit.MINUTES);
	    }
	}
}
