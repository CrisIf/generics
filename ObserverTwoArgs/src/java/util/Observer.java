/**
 * 
 */
package java.util;

/**
 * @author ciftimi
 * 
 */
public interface Observer<S extends Observable<?, A>, A> {
	public void update(S o, A a);
}
