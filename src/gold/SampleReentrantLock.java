package gold;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class SampleReentrantLock {

	class Test{
		
		private final ReentrantLock lock = new ReentrantLock();
		
		public void lock() {
			this.lock.lock();
		}
		public void unlock() {
			this.lock.unlock();
		}
		
		public void first() {
			for (int i = 0;i < 10;i++) {
				System.out.println(Thread.currentThread().getId() + ":1 " + i);	
			}
					
		}
		public void second() {
			for (int i = 0;i < 10;i++) {
				System.out.println(Thread.currentThread().getId() + ":2 "+ i);	
			}
		}
		public void thirdt() {
			for (int i = 0;i < 10;i++) {
				System.out.println(Thread.currentThread().getId() + ":3 "+ i);	
			}	
		}
	}
	
	class Task implements Runnable {
		private Test test;
		public Task(Test test) {
			super();
			this.test = test;
		}
		@Override
		public void run() {

			try {
			test.lock();
			
			test.first();

			test.second();

			
			test.thirdt();
			} finally {
				test.unlock();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SampleReentrantLock sample =  new SampleReentrantLock();
		Test t = sample.new Test();
		ExecutorService exec = Executors.newFixedThreadPool(3);
		exec.submit(sample.new Task(t));
		exec.submit(sample.new Task(t));
		exec.submit(sample.new Task(t));
		
		
	}

}
