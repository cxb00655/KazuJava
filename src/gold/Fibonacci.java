package gold;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Fibonacci {

	
	static class FibonacciTask extends RecursiveTask<Integer> {

	    private final int n;

	    FibonacciTask(int n) {
	        this.n = n;
	    }

	    @Override
	    protected Integer compute() {
	        if (n == 0) {
	            return 0;
	        } else if (n == 1) {
	            return 1;
	        } else {
	            FibonacciTask f1 = new FibonacciTask(n - 1);
	            FibonacciTask f2 = new FibonacciTask(n - 2);

	            f2.fork();
	            return f1.compute() + f2.join();
	        }
	    }
	}

	public static void main(String[] args) {
	    ForkJoinPool pool = new ForkJoinPool();
	    System.out.println(pool.invoke(new FibonacciTask(45)));
	}
}	
