package nobounds;

import java.util.Observable;
import java.util.Observer;

/**
 * 
 */

/**
 * @author ciftimi
 * 
 */
public class Mother implements Observer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable subject, Object param) {
		String babyName = (String) param;
		System.out.println("Let's change that diaper on " + babyName + "!");
	}

}
