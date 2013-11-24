package nobounds;

import java.util.Observable;

/**
 * 
 */

/**
 * @author ciftimi
 * 
 */
public class Dog extends Observable {

	/*
	 * The dog's name
	 */
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
