package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleMultiThreadKyogo implements Runnable {

	private int num = 100;
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SampleMultiThreadKyogo s = new SampleMultiThreadKyogo();
		ExecutorService exec = Executors.newFixedThreadPool(2);
		exec.submit(s);
		exec.submit(s);

		
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		System.out.println(s.num);
		exec.shutdown();
		

	}
	
	
	// public void add(int amount) {  // これだとnumの値が保障されない
	public synchronized void add(int amount) {
		this.num = this.num + amount;
		
	}
	
	@Override
	public void run() {
		add(100);
	}

}
