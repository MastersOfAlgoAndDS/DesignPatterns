/**
 * 
 */
package ObserverDesignPattern;

/**
 * @author Milind
 *
 */
public interface IObservable {
	public void register(IObserver o);
	public void unregister(IObserver o);
	public void notifi();
	public void changeState();
}
