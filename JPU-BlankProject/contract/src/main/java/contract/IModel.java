package contract;

import java.util.Observable;
import entity.Map;

/**
 * The Interface IModel.
 *
 * @author Vincent Jacques
 */
public interface IModel {

	/**
	 * Gets the Map.
	 *
	 * @return the Map entity
	 */
	Map getMap();

	/**
	 * Load the Map.
	 *
	 * @param id
	 *          the id
	 *
	

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
	
	void modelNotify();
	
	void loop();
}
