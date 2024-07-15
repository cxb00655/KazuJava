package gold;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
class RecursiveExample1 extends RecursiveTask<Long> {
	private static final long serialVersionUID = 1L;
	@Override
	protected Long compute() {
		long sum = 0;
		for (int i = 1; i <= 100 * 10000; i++) {
			sum += i;
		}
		return sum; // 結果を返す
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ForkJoinTask<Long> task = new RecursiveExample1();
		long result = task.fork().join(); // 処理開始＋終了待ち＋結果取得
		System.out.println("result is " + result);
	}

}
