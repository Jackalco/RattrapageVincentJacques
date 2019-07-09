package mobileElements;

public class Player2 extends MobileElements {
	
	/** The last direction x of the Player 2*/
	private int lastDirectionX;
	/** The last direction y of the Player 2*/
	private int lastDirectionY;
	
	/**
	 * The Player2 constructor
	 * 
	 * @param x
	 * @param y
	 */
	public Player2(int x, int y) {
		super(x, y);
		this.AlivePlayer2 = true;
	}
	
	/**
	 * Defines the new direction according to its last direction and the choice of the player
	 * 
	 * @param direction
	 */
	public void movePlayer2(char direction) {
		switch(direction) {
		case 'K':
			if (lastDirectionX == 0 && lastDirectionY == -1) {
				this.Move1(-1, 0);
				this.setLastDirection2(-1,0);
			} else if (lastDirectionX == -1 && lastDirectionY == 0) {
				this.Move1(0, +1);
				this.setLastDirection2(0, +1);
			} else if (lastDirectionX == 0 && lastDirectionY == +1) {
				this.Move1(+1, 0);
				this.setLastDirection2(+1, 0);
			} else if (lastDirectionX == +1 && lastDirectionY == 0) {
				this.Move1(0, -1);
				this.setLastDirection2(0, -1);
			} else {
				this.Move1(-1, 0);
				this.setLastDirection2(-1, 0);
			}
			break;
		case 'L':
			if (lastDirectionX == +1 && lastDirectionY == 0) {
				this.Move1(0, +1);
				this.setLastDirection2(0, +1);
			} else if (lastDirectionX == -1 && lastDirectionY == 0) {
				this.Move1(0, -1);
				this.setLastDirection2(0, -1);
			} else if (lastDirectionX == 0 && lastDirectionY == +1) {
				this.Move1(-1, 0);
				this.setLastDirection2(-1, 0);
			} else if(lastDirectionX == 0 && lastDirectionY == -1) {
				this.Move1(+1, 0);
				this.setLastDirection2(+1, 0);
			} else {
				this.Move1(+1, 0);
				this.setLastDirection2(+1, 0);
			}
			break;
		}

		}
	
	/**
	 * The setLastDirection2 method
	 * 
	 * @param x
	 * @param y
	 */
	public void setLastDirection2(int x, int y) {
		this.lastDirectionX = x;
		this.lastDirectionY = y;
	}
	
	/**
	 * The getLastDirectionXPlayer2 method
	 * 
	 * @return lastDirectionX
	 */
	public int getLastDirectionXPlayer2() {
		return lastDirectionX;
	}
	
	/**
	 * The getLastDirectionYPlayer2 method
	 * 
	 * @return lastDirectionY
	 */
	public int getLastDirectionYPlayer2() {
		return lastDirectionY;
	}
	
	/**
	 * Move the Player 2 according to his last direction
	 */
	public void defaultDirection2() {
		this.Move1(this.getLastDirectionXPlayer2(), this.getLastDirectionYPlayer2());
	}

}
