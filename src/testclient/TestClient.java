package testclient;

import pkg.adaptee.Adaptee;
import pkg.target.impl.Adapter;
import pkg.target.impl.ExampleA;
import pkg.target.impl.ExampleB;

public class TestClient {

	public static void main(String[] args) {

		System.out.println("Start: AdapterObject");

		// Example A and B are other implementations of Target
		ExampleA myExampleAObject = new ExampleA();
		ExampleB myExampleBObject = new ExampleB();

		// The Adaptee object with the old methods
		Adaptee myAdapteeObject = new Adaptee();

		// The Adapter executes the old methods from Adaptee
		Adapter myAdapterObject = new Adapter(myAdapteeObject);

		// Example A with his own implementation
		System.out
				.println("\nThe ExampleA: Executes his own implementation from target");
		myExampleAObject.newAssignDriver("DriverA");
		myExampleAObject.newDriveForward();
		myExampleAObject.newFireWeapon();

		// Example B with his own implementation
		System.out
				.println("\nThe ExampleB: executes his own implementation target");
		myExampleBObject.newAssignDriver("DriverB");
		myExampleBObject.newDriveForward();
		myExampleBObject.newFireWeapon();

		System.out
				.println("\nThe Adaptee: Executes his own old implementation");
		myAdapteeObject.oldReactToHuman("DricerAdatpee");
		myAdapteeObject.oldWalkForward();
		myAdapteeObject.oldSmashWithHands();

		System.out
				.println("\nThe Adapter: Executes the implementation from target and this executes the old methods from Adaptee");
		myAdapterObject.newAssignDriver("Adapter");
		myAdapterObject.newDriveForward();
		myAdapterObject.newFireWeapon();

	}

}
