package pkg.target.impl;
import java.util.Random;

import pkg.targetinterface.Target;

public class ExampleB implements Target {

	Random generator = new Random();
	
	//
	//
	//
	
	@Override
	public void newFireWeapon() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy ExampleB does " + attackDamage + " damage");
	}

	@Override
	public void newDriveForward() {
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy ExampleB moves " + movement + " spaces");
		
	}

	@Override
	public void newAssignDriver(String driverName) {
		System.out.println(driverName + " is driving the ExampleB");
		
	}

}
