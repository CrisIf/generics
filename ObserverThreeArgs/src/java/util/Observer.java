/**
 * 
 */
package java.util;

/**
 * @author ciftimi
 * 
 */
public interface Observer<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {
	public void update(S o, A a);
}
