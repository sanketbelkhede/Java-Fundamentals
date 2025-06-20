package multithreading;

class WriteR implements Runnable {
	static {
		System.out.println(Thread.currentThread().getState());
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("writing");
			System.out.println(Thread.currentThread().getState());
			try {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getState());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getState());
		}
	}
}

class CompileR implements Runnable {
	public void run() {
		for( ; ; ) {
			System.out.println("compiling");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class SaveR implements Runnable {
	public void run() {
		for( ; ; ) {
			System.out.println("saving");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

public class WriteSaveCompileRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new WriteR());
		System.out.println(t1.getState());
		Thread t2 = new Thread(new SaveR());
		Thread t3 = new Thread(new CompileR());
		t2.setDaemon(true);
		t3.setDaemon(true);
		t1.start();
		System.out.println(t1.getState());
		t2.start();
		t3.start();

	}

}
