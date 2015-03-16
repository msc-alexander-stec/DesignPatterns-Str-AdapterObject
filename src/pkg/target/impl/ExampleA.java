package pkg.target.impl;
import java.util.Random;

import pkg.targetinterface.Target;

public class ExampleA implements Target {

	Random generator = new Random();
	
	//
	//
	//
	
	@Override
	public void newFireWeapon() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy ExampleA does " + attackDamage + " damage");
	}

	@Override
	public void newDriveForward() {
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy ExampleA moves " + movement + " spaces");
		
	}

	@Override
	public void newAssignDriver(String driverName) {
		System.out.println(driverName + " is driving the ExampleA");
		
	}

}
