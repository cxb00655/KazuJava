package gold;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleCyclicBarrier implements Runnable {

	private CyclicBarrier barrier;
	
	public SampleCyclicBarrier(CyclicBarrier barrier) {
		super();
		this.barrier = barrier;
	}
	
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		long id = Thread.currentThread().getId();
		System.out.println("START:" + id);
		int r = new Random().nextInt(10);
		try {
			Thread.sleep(r*100);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
			
		System.out.println("END:" + id);
		
		try {
			this.barrier.await();
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}		
		
	}

	public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ
		
		ExecutorService exec = Executors.newFixedThreadPool(5);
		CyclicBarrier barrier = new CyclicBarrier(5, () -> {
			System.out.println("it's all done.");
		});
		for(int i = 0; i < 5; i++) {
			exec.submit(new SampleCyclicBarrier(barrier));
		}
		
		
	}

}


