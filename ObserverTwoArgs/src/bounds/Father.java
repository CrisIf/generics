package bounds;

import java.util.Observer;

/**
 * 
 */

/**
 * @author ciftimi
 * 
 */
public class Father implements Observer<Dog, String> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Dog o, String dogName) {
		System.out.println(dogName + ", let's go to a walk!");

	}

}
