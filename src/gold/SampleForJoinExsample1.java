package gold;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class SampleForJoinExsample1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		ForkJoinPool pool = new ForkJoinPool();
		ForkJoinTask<Long> task = pool.submit(new ForkJoinExample1()); // 処理開始
		long result = task.join(); // 終了待ち＋結果取得
		System.out.println("result  is " + result);
		
		
		long result2 = pool.invoke(new ForkJoinExample1()); // 処理開始＋終了待ち＋結果取得
		System.out.println("result2 is " + result2);
		
		ForkJoinTask<Long> task2 = new ForkJoinExample1();
		task2.fork(); // 処理開始
		long result3 = task2.join(); // 終了待ち＋結果取3
		System.out.println("result3 is " + result3);
		
		ForkJoinTask<Long> task3 = new ForkJoinExample1();
		long result4 = task3.fork().join(); // 処理開始＋終了待ち＋結果取得
		System.out.println("result4 is " + result4);
		
		
		ForkJoinTask<Long> task4 = new ForkJoinExample1();
		task4.fork(); // 処理開始
		long result5 = task4.join(); // 終了待ち＋結果取得
		System.out.println("result5 is " + result5);
		
		long result6 = task4.fork().join(); // 処理開始＋終了待ち＋結果取得
		System.out.println("result6 is " + result6);

	}

}
