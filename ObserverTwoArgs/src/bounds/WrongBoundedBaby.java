package bounds;

import java.util.Observable;

/**
 * 
 */

/**
 * @author ciftimi
 * 
 */
public class WrongBoundedBaby extends Observable<WrongBoundedMother, String> {
	/*
	 * The baby's name
	 */
	private String name;

	public WrongBoundedBaby(String name) {
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
