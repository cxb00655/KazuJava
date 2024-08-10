package thread;

/* Udemy より
 * スレッドセーフ、アンセーフのサンプル
 * */
public class SampleMySharedThread extends Thread {
	private Shared shared;
	private int num;
	public SampleMySharedThread() {		
	}
	public SampleMySharedThread(Shared shared, int num, String name) {
		super(name);
		this.num = num;
		this.shared = shared;
	}
	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		super.run();
		System.out.println("run start. name is " + getName());
		for (int i = 0; i < 10 ; i++) {
			sleepRandomTime(400,500);
			shared.addata(num);
			System.out.println(getName() + " : " + num + "加算する。合計：" + shared.getData()	);
		}
		System.out.println("run finish. name is " + getName()	);
		
	}
	private void sleepRandomTime(int i, int j) {
		boolean flag = true;
		try {
			if (flag) {
				sleep(i);
				flag=false;
			} else {
				sleep(j);
				flag=true;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception {
		Shared shared = new SampleMySharedThread().new Shared(0);
		System.out.println("SampleMyParaThread main start.");
		SampleMySharedThread t1 = new SampleMySharedThread(shared, 1, "TAKARA");
		t1.start();
		SampleMySharedThread t2 = new SampleMySharedThread(shared, 2,"KAZU");
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("SampleMyParaThread main finish.data is " + shared.getData());
	}
	public class Shared{
		private int data;
		public Shared(int data) {
			super();
			this.data = data;
		}
		public int getData() {
			return this.data;
		}
		synchronized public void addata(int num) {   // スレッドセーフ
		//public void addata(int num) {	             // スレッドアンセーフ
			int tmp = this.data +num;
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.data = tmp;
		}		
	}
}
