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
public class Father implements Observer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		String dogName = (String) arg;
		System.out.println(dogName + ", let's go to a walk!");

	}

}
