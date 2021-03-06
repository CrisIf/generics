package nobounds;

/**
 * 
 */

/**
 * @author ciftimi
 * 
 */
public class TestingLegacy {
	public static void main(String[] args) {

		Baby david = new Baby("David");
		Mother mom = new Mother();

		Dog rover = new Dog("Rover");
		Father john = new Father();

		// test mother-baby relationship
		david.addObserver(mom);
		david.babyIsCrying();

		// test father-dog relationship
		rover.addObserver(john);
		rover.barks();

		// delete observers to test wrong relatinships
		david.deleteObservers();
		rover.deleteObservers();

		System.out.println("Add a wrong relationship and test.");

		// add the father as the baby's observer
		david.addObserver(john);
		// add the mother as the dog's observer
		rover.addObserver(mom);

		david.babyIsCrying();
		rover.barks();
	}

}
