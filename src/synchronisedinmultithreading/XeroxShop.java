package synchronisedinmultithreading;

class Printer implements Runnable {
	@Override
	public synchronized void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started printing");
		for(int i=0; i<3; i++) {
			System.out.println(name + " printing");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(name + " completed printing");
	}
}

public class XeroxShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p = new Printer();
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);
		
		t1.setName("Boy");
		t2.setName("Girl");
		t3.setName("Lady");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
