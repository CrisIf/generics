package bounds;

import java.util.Observable;

/**
 * 
 */

/**
 * @author ciftimi
 * 
 */
public class Baby extends Observable<Mother, String> {

	/*
	 * The baby's name
	 */
	private String name;

	public Baby(String name) {
		this.name = name;
	}

	/**
	 * The event to notify about.
	 */
	public void babyIsCrying() {
		setChanged();
		notifyObservers(name);
	}

}
