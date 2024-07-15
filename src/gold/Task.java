package gold;

import java.util.concurrent.RecursiveTask;

public class Task extends RecursiveTask<String> {

	@Override
	protected String compute() {
		return "Task ended";
	}
}