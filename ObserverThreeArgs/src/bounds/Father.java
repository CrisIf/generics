package bounds;

import java.util.Observer;

/**
 * 
 */

/**
 * @author ciftimi
 * 
 */
public class Father implements Observer<Dog, Father, String> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Dog dog, String dogName) {
		System.out.println(dogName + ", let's go to a walk!");

	}

}
