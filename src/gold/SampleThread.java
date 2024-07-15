package gold;

/* Threadを継承したサンプル */
public class SampleThread extends Thread{

	@Override
	public void run() {
		System.out.println("sub");
	}
	
	
	public static void main(String[] args) {
		Thread t = new SampleThread();
		t.start();

		
		
		for(int i=0; i < 10; i++) {
			System.out.println("main :" + i);	
		}
	
	}
	
}
