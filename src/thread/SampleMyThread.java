package thread;

/* Udemy より*/
public class SampleMyThread extends Thread {
	
	private int data;
	public SampleMyThread(int data) {
		this.data = data;
	}
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		super.run();
		System.out.println("SampleMyThread start.");
		var total = 0L;
		for (var i=0L; i < 100_000_000_000L;i++) {
			total+=data;
		}
		System.out.println("SampleMyThread finish. total is " + total);
		
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SampleMyThread t = new SampleMyThread(3);
		System.out.println("SampleMyThread main start.");
		t.start();
		System.out.println("SampleMyThread main finish.");
	}

}
