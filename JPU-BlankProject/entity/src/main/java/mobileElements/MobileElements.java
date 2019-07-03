package mobileElements;

import collisions.Collisions;
import entity.Entity;

public class MobileElements extends Entity {
	
	public MobileElements(int x, int y) {
		super(x, y);
	}
	
	public void Move(int x, int y) {
		final int Xpos = this.getPositionX();
		final int Ypos = this.getPositionY();
		final Entity[][] loadMap = this.getMap().getArrayMap();
		final Player1 player1 = this.getMap().getPlayer1();
		final Player2 player2 = this.getMap().getPlayer2();
		final Collisions getCollisions = this.getMap().getCollisions();
		boolean collision = false;
		
		if(this instanceof Player1) {
			collision = getCollisions.checkCollisions(loadMap, Xpos + x, Ypos + y);
		} else {
			collision = getCollisions.checkEmpty(loadMap, Xpos + x, Ypos + y);
		}
	}

}
