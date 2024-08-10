package thread;

/* Udemy より*/
public class SampleMyParaThread extends Thread {
	
	private long timer;
	public SampleMyParaThread(String name,long timer) {
		super(name);
		this.timer = timer;
	}
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		super.run();
		System.out.println("run start. name is " + getName()	);
		
		try {
			sleep(timer);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		System.out.println("run finish. name is " + getName()	);
		
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("SampleMyParaThread main start.");
		SampleMyParaThread t1 = new SampleMyParaThread("TAKARA", 5000L);
		t1.start();
		SampleMyParaThread t2 = new SampleMyParaThread("KAZU", 8000L);
		t2.start();
		System.out.println("SampleMyParaThread main finish.");
	}

}
