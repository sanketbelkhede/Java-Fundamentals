package synchronisedinmultithreading;

class Family1 implements Runnable {
	String resource1 = "TV";
	String resource2 = "Play Station";
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("rohit")) {
			rohitAccResource();
		}else {
			vijayAccResource();
		}
	}
	
	public void rohitAccResource() {
		synchronized(resource1) {
			System.out.println("Rohit acquired TV.");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(resource2) {
				System.out.println("Rohit acquired Play Station.");
			}
		}
	}
	
	public void vijayAccResource() {
		synchronized(resource2) {
			System.out.println("Vijay acquired Play Station.");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(resource1) {
				System.out.println("Vijay acquired TV.");
			}
		}
	}
}

public class TVandPlayStationDeadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Family1 f = new Family1();
		Thread t1 = new Thread(f,"rohit");
		Thread t2 = new Thread(f,"vijay");
		
		t1.start();
		t2.start();

	}

}
