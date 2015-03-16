package pkg.adaptee;
import java.util.Random;


public class Adaptee {

	Random generator = new Random();
	
	public void oldSmashWithHands() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy robot does causes " + attackDamage + " damage with its hands");
	}
	
	public void oldWalkForward() {
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy robot walks forward " + movement + " spaces");
	}
	
	public void oldReactToHuman(String driverName) {
		System.out.println("Enemy robot tramps on " + driverName);
	}

}