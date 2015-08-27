package synchronization;

class Methods {

	synchronized void writeNumbers() {
		for(int i = 0; i <= 50000; i++){
			System.out.println(i);
			
			if(i == 25000){
				try {
					wait();
				} catch (Exception e) {

				}
				
			}
		}
	}

	synchronized void writeText() {
		for(int i = 0; i < 20; i++){
			System.out.println("Running…");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}
		notify();
	}
}

public class InterThreadCommunication {
	
	public static void main(String[] args) {
	Methods method = new Methods();
		
		new Thread() {
			public void run() {
				method.writeNumbers();
			}
		}.start();

		new Thread() {
			public void run() {
				method.writeText();
			}
		}.start();
	}
	
}
