package threads;

public class FifthThread extends Thread{

	public void run() {
		System.out.println("The thread is started!");
		this.setName("Fifth thread");
		System.out.println("I am " + this.getName() + "!");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}		
		System.out.println("�he " + this.getName() + " complete!");
	}
	
	public static void main(String[] args) {
		Thread t1 = new FirstThread();
		Thread t2 = new SecondThread();
		Thread t3 = new ThirdThread();
		Thread t4 = new FourthThread();
		Thread t5 = new FifthThread();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
