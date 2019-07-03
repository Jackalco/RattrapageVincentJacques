package collisions;

import entity.Entity;
import motionLessElements.Empty;
import motionLessElements.Wall;
import motionLessElements.wallPlayer1;
import motionLessElements.wallPlayer2;

public class Collisions {
	
	public Collisions() {
		
	}
	
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
	
	public boolean checkEmpty(Entity[][] entity, int x, int y) {
		if(entity[x][y] instanceof Empty) {
			return false;
		}
		return true;
	}
}
