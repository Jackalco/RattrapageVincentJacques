package contract;

import java.sql.Connection;
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
	
	void isWinner(int number);
	

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
	
	void modelNotify();
	
	void loop();
}
