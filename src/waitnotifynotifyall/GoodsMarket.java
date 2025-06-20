package waitnotifynotifyall;

class Goods {
	int currentItem;
	boolean itemPresent = false;
	
	public synchronized void ProduceGood(int i) {
		this.currentItem = i;
		System.out.println("Produced good number " + i);
		itemPresent = true;
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void ConsumeGood() {
		if(!itemPresent) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Consumed good number " + currentItem);
		itemPresent = false;
		notify();
	}
}

class Producer extends Thread {
	Goods good;
	Producer(Goods good) {
		this.good = good;
	}
	public void run() {
		for(int i=1; i<10; i++) {
			good.ProduceGood(i);
		}
	}
}

class Consumer extends Thread {
	Goods good;
	Consumer(Goods good) {
		this.good = good;
	}
	public void run() {
		for(int i=1; i<10;i++) {
			good.ConsumeGood();
		}
	}
}

public class GoodsMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods good = new Goods();
		Producer p1 = new Producer(good);
		Consumer c1 = new Consumer(good);
		
		p1.start();
		c1.start();

	}

}
