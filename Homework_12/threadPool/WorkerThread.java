package threadPool;

public class WorkerThread extends Thread{
	
	private int time;
	private int name;
	
	public WorkerThread(int time, int name){
		this.time = time;
		this.name = name;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " is started!");
		Thread.currentThread().setName("Thread " +  name);
		processMessage(time);				
		System.out.println(Thread.currentThread().getName() + " complete!");
	}
	
	private void processMessage(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
