package threads;

public class ThirdThread extends Thread{

	public void run() {
		System.out.println("The thread is started!");
		this.setName("Third thread");
		System.out.println("I am " + this.getName() + "!");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}		
		System.out.println("�he " + this.getName() + " complete!");
	}
}
