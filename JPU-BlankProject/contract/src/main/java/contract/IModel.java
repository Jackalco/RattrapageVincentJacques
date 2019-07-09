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
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
	
	/**
	 * Notify observers.
	 */
	void modelNotify();
	
	/**
	 * Execute methods in the model to load the game.
	 */
	void loop();
	
	/**
	 * set the winner at the end of the game and send the time to the method addWinner
	 * 
	 * @param number
	 */
	void isWinner(int number);
}
