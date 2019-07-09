package collisions;

import entity.Entity;
import motionLessElements.Empty;
import motionLessElements.Wall;
import motionLessElements.wallPlayer1;
import motionLessElements.wallPlayer2;

/**
 * The Class Collisions
 * 
 * @author Vincent Jacques
 *
 */

public class Collisions {
	
	/**
	 * Collisions constructor.
	 */
	public Collisions() {
		
	}
	
	/**
	 * The checkCollisions method.
	 * @param entity 
	 * @param x
	 * @param y
	 * @return a boolean that indicates if there is a collision or not.
	 */
	public boolean checkCollisions(Entity[][] entity, int x, int y) {
		if(entity[x][y] instanceof Wall) {
			return true;
		} else if (entity[x][y] instanceof wallPlayer1) {
			return true;
		} else if (entity[x][y] instanceof wallPlayer2) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * The checkEmpty method.
	 * @param entity
	 * @param x
	 * @param y
	 * @return a boolean that indicates if there is a path near the entity. If true, it can moves.
	 */
	public boolean checkEmpty(Entity[][] entity, int x, int y) {
		if(entity[x][y] instanceof Empty) {
			return false;
		}
		return true;
	}
}
