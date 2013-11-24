package bounds;

import java.util.Observable;

/**
 * 
 */

/**
 * @author ciftimi
 * 
 */
public class Dog extends Observable<Dog, Father, String> {

	private String name;

	public Dog(String name) {
		this.name = name;
	}

	/**
	 * The event to notify about.
	 */
	public void barks() {
		setChanged();
		notifyObservers(name);
	}

}
