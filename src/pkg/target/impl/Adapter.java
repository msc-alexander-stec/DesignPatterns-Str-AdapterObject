package pkg.target.impl;

import pkg.adaptee.Adaptee;
import pkg.targetinterface.Target;

public class Adapter implements Target {

	Adaptee myAdapteeObject;

	//
	// Constructor
	//

	public Adapter(Adaptee object) {
		myAdapteeObject = object;
	}

	//
	//
	//

	@Override
	public void newFireWeapon() {
		myAdapteeObject.oldSmashWithHands();
	}

	@Override
	public void newDriveForward() {
		myAdapteeObject.oldWalkForward();
	}

	@Override
	public void newAssignDriver(String driverName) {
		myAdapteeObject.oldReactToHuman(driverName);
	}

}
