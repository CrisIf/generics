package bounds;

import java.util.Observer;

/**
 * 
 */

/**
 * @author ciftimi
 * 
 */
public class Mother implements Observer<Baby, Mother, String> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Baby baby, String babyName) {
		System.out.println("Let's change that diaper on " + babyName + "!");
	}

}
