package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(7);
		
		for (int i = 1; i <= 5; i++) {
			WorkerThread worker = new WorkerThread(i * 2000, i);
			executor.execute(worker);
		}
		
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
	}
}
