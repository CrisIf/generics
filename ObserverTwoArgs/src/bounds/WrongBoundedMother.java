package bounds;

import java.util.Observer;

/**
 * 
 */

/**
 * @author ciftimi
 * 
 */
public class WrongBoundedMother implements Observer<Dog, String> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Dog subject, String babyName) {
		System.out.println("Let's change that diaper on " + babyName + "!");
	}

}
