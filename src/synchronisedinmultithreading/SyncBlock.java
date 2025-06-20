package synchronisedinmultithreading;

class ExecuteLines implements Runnable {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		try {
			System.out.println(name + " executing line 1");
			Thread.sleep(1000);
			System.out.println(name + " executing line 2");
			Thread.sleep(1000);
			System.out.println(name + " executing line 3");
			Thread.sleep(1000);
			System.out.println(name + " executing line 4");
			Thread.sleep(1000);
			synchronized(this){
				System.out.println(name + " executing line 5");
				Thread.sleep(1000);
				System.out.println(name + " executing line 6");
				Thread.sleep(1000);
				System.out.println(name + " executing line 7");
				Thread.sleep(1000);
			}
			System.out.println(name + " executing line 8");
			Thread.sleep(1000);
			System.out.println(name + " executing line 9");
			Thread.sleep(1000);
			System.out.println(name + " executing line 10");
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " completed printing");
	}
}

public class SyncBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecuteLines p = new ExecuteLines();
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
