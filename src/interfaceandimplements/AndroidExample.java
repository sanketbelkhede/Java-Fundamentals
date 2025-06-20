package interfaceandimplements;

interface Communication{
	void call(long contact);
	void msg(String body, long contact); 
}

interface Entertainment{
	void playGame(String name);
	void playMusic(String name, String singer); 
}

class SmartPhone implements Communication, Entertainment{

	@Override
	public void playGame(String name) {
		System.out.println(name);
		
	}

	@Override
	public void playMusic(String name, String singer) {
		System.out.println(name + " " + singer);
		
	}

	@Override
	public void call(long contact) {
		System.out.println(contact);
		
	}

	@Override
	public void msg(String body, long contact) {
		System.out.println(body + " " + contact);
		
	}
	
}

public class AndroidExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp = new SmartPhone();
		sp.msg("hi,hello", 9876543210l);
		sp.call(9876543210l);
		sp.playGame("Mini Militia");
		sp.playMusic("Payal", "Honey Singh");

	}

}
