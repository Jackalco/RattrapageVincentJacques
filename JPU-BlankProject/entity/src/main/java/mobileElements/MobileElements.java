package mobileElements;

import collisions.Collisions;
import entity.Entity;
import motionLessElements.Empty;
import motionLessElements.wallPlayer1;
import motionLessElements.wallPlayer2;

public class MobileElements extends Entity {
	
	protected boolean AlivePlayer1;
	protected boolean AlivePlayer2;
	
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
		boolean collision1 = false;
		boolean collision2 = false;
		
		if(this instanceof Player1) {
			collision1 = getCollisions.checkCollisions(loadMap, Xpos + x, Ypos + y);
		} else {
			collision1 = getCollisions.checkEmpty(loadMap, Xpos + x, Ypos + y);
		}
		
		if(!collision1) {
			loadMap[Xpos + x][Ypos + y] = loadMap[Xpos][Ypos];
			loadMap[Xpos][Ypos] = new wallPlayer1(Xpos,Ypos);
			this.setPositionX(Xpos + x);
			this.setPositionY(Ypos + y);
		} else if(collision1) {
			this.setAlivePlayer1(false);
		}
		
		if(this instanceof Player2) {
			collision2 = getCollisions.checkCollisions(loadMap, Xpos + x, Ypos + y);
		} else {
			collision2 = getCollisions.checkEmpty(loadMap, Xpos + x, Ypos + y);
		}
		
		if(!collision2) {
			loadMap[Xpos + x][Ypos + y] = loadMap[Xpos][Ypos];
			loadMap[Xpos][Ypos] = new wallPlayer2(Xpos,Ypos);
			this.setPositionX(Xpos + x);
			this.setPositionY(Ypos + y);
		}
	}
	
	public boolean getAlivePlayer1() {
		return AlivePlayer1;
	}
	
	public void setAlivePlayer1(boolean alive1) {
		this.AlivePlayer1 = alive1;
	}
	
	public boolean getAlivePlayer2() {
		return AlivePlayer2;
	}
	
	public void setAlivePlayer2(boolean alive2) {
		this.AlivePlayer2 = alive2;
	}

}
