package gold;

import java.util.concurrent.ForkJoinTask;
class ForkJoinExample1 extends ForkJoinTask<Long> {
	private static final long serialVersionUID = 1L;

	private long result;
	@Override
	protected boolean exec() {
		long sum = 0;
		for (int i = 1; i <= 100 * 10000; i++) {
			sum += i;
		}
		setRawResult(sum); // 結果保存

		return true;
	}
	@Override
	public Long getRawResult() {
		return result;
	}

	@Override
	protected void setRawResult(Long arg) {
		this.result = arg;
	}
}