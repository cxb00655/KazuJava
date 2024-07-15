package gold;

import java.util.concurrent.ForkJoinTask;

public class ForkJoinTaskSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ForkJoinTask<Long> task = ForkJoinTask.adapt(() -> {
			long sum = 0;
			for (int i = 1; i <= 100 * 10000; i++) {
				sum += i;
			}
			return sum;
		});

		long result = task.fork().join(); // 処理開始＋終了待ち＋結果取得
		
		System.out.println("result  is " + result);
		
	}

}
