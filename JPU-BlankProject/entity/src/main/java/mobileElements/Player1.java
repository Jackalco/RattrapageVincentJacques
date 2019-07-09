package mobileElements;

public class Player1 extends MobileElements {
	
	/** The last direction x of the Player 1*/
	private int lastDirectionX;
	/** The last direction y of the Player 1*/
	private int lastDirectionY;
	
	/**
	 * The Player1 constructor
	 * 
	 * @param x
	 * @param y
	 */
	public Player1(int x, int y) {
		super(x, y);
		this.AlivePlayer1 = true;
	}
	
	/**
	 * Defines the new direction according to its last direction and the choice of the player
	 * 
	 * @param direction
	 */
	public void movePlayer1(char direction) {
		switch(direction) {
		case 'Q':
			if (lastDirectionX == 0 && lastDirectionY == -1) {
				this.Move(-1, 0);
				this.setLastDirection1(-1,0);
			} else if (lastDirectionX == -1 && lastDirectionY == 0) {
				this.Move(0, +1);
				this.setLastDirection1(0, +1);
			} else if (lastDirectionX == 0 && lastDirectionY == +1) {
				this.Move(+1, 0);
				this.setLastDirection1(+1, 0);
			} else if (lastDirectionX == +1 && lastDirectionY == 0) {
				this.Move(0, -1);
				this.setLastDirection1(0, -1);
			} else {
				this.Move(-1, 0);
				this.setLastDirection1(-1, 0);
			}
			break;
		case 'D':
			if (lastDirectionX == +1 && lastDirectionY == 0) {
				this.Move(0, +1);
				this.setLastDirection1(0, +1);
			} else if (lastDirectionX == -1 && lastDirectionY == 0) {
				this.Move(0, -1);
				this.setLastDirection1(0, -1);
			} else if (lastDirectionX == 0 && lastDirectionY == +1) {
				this.Move(-1, 0);
				this.setLastDirection1(-1, 0);
			} else if(lastDirectionX == 0 && lastDirectionY == -1) {
				this.Move(+1, 0);
				this.setLastDirection1(+1, 0);
			} else {
				this.Move(+1, 0);
				this.setLastDirection1(+1, 0);
			}
			break;
		}
	}
	
	/**
	 * The setLastDirection1 method
	 * 
	 * @param x
	 * @param y
	 */
	public void setLastDirection1(int x, int y) {
		this.lastDirectionX = x;
		this.lastDirectionY = y;
	}
	
	/**
	 * The getLastDirectionXPlayer1 method
	 * 
	 * @return lastDirectionX
	 */
	public int getLastDirectionXPlayer1() {
		return lastDirectionX;
	}
	
	/**
	 * The getLastDirectionYPlayer1 method
	 * 
	 * @return lastDirectionY
	 */
	public int getLastDirectionYPlayer1() {
		return lastDirectionY;
	}
	
	/**
	 * Move the Player 1 according to his last direction
	 */
	public void defaultDirection1() {
		this.Move(this.getLastDirectionXPlayer1(), this.getLastDirectionYPlayer1());
	}
	
}
