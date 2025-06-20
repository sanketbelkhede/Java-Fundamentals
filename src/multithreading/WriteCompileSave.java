package multithreading;

class Write extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("writing");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Compile extends Thread{
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

class Save extends Thread{
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

public class WriteCompileSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Write w = new Write();
		Compile c = new Compile();
		Save s = new Save();
		c.setDaemon(true);
		s.setDaemon(true);
		w.start();
		s.start();
		c.start();

	}

}
