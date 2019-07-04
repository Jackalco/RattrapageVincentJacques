package mobileElements;

public class Player1 extends MobileElements {
	private int lastDirectionX;
	private int lastDirectionY;
	
	public Player1(int x, int y) {
		super(x, y);
	}
	
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
	
	public void setLastDirection1(int x, int y) {
		this.lastDirectionX = x;
		this.lastDirectionY = y;
	}
	
	public int getLastDirectionXPlayer1() {
		return lastDirectionX;
	}
	
	public int getLastDirectionYPlayer1() {
		return lastDirectionY;
	}

}
