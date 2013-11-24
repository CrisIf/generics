/**
 * 
 */
package java.util;

/**
 * @author ciftimi
 * 
 */
class StubException extends UnsupportedOperationException {

	private static final long serialVersionUID = 1L;

}

public class Observable<O extends Observer<?, A>, A> {
	public void addObserver(O o) {
		throw new StubException();
	}

	protected void clearChanged() {
		throw new StubException();
	}

	public int countObservers() {
		throw new StubException();
	}

	public void deleteObserver(O o) {
		throw new StubException();
	}

	public void deleteObservers() {
		throw new StubException();
	}

	public boolean hasChanged() {
		throw new StubException();
	}

	public void notifyObservers() {
		throw new StubException();
	}

	public void notifyObservers(A a) {
		throw new StubException();
	}

	protected void setChanged() {
		throw new StubException();
	}
}