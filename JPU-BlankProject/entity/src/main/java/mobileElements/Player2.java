package mobileElements;

public class Player2 extends MobileElements {
	private int lastDirectionX;
	private int lastDirectionY;
	
	public Player2(int x, int y) {
		super(x, y);
	}
	
	public void movePlayer2(char direction) {
		switch(direction) {
		case 'K':
			if (lastDirectionX == 0 && lastDirectionY == -1) {
				this.Move(-1, 0);
				this.setLastDirection2(-1,0);
			} else if (lastDirectionX == -1 && lastDirectionY == 0) {
				this.Move(0, +1);
				this.setLastDirection2(0, +1);
			} else if (lastDirectionX == 0 && lastDirectionY == +1) {
				this.Move(+1, 0);
				this.setLastDirection2(+1, 0);
			} else if (lastDirectionX == +1 && lastDirectionY == 0) {
				this.Move(0, -1);
				this.setLastDirection2(0, -1);
			} else {
				this.Move(-1, 0);
				this.setLastDirection2(-1, 0);
			}
			break;
		case 'L':
			if (lastDirectionX == +1 && lastDirectionY == 0) {
				this.Move(0, +1);
				this.setLastDirection2(0, +1);
			} else if (lastDirectionX == -1 && lastDirectionY == 0) {
				this.Move(0, -1);
				this.setLastDirection2(0, -1);
			} else if (lastDirectionX == 0 && lastDirectionY == +1) {
				this.Move(-1, 0);
				this.setLastDirection2(-1, 0);
			} else if(lastDirectionX == 0 && lastDirectionY == -1) {
				this.Move(+1, 0);
				this.setLastDirection2(+1, 0);
			} else {
				this.Move(+1, 0);
				this.setLastDirection2(+1, 0);
			}
			break;
		}

		}
	
	public void setLastDirection2(int x, int y) {
		this.lastDirectionX = x;
		this.lastDirectionY = y;
	}
	
	public int getLastDirectionXPlayer2() {
		return lastDirectionX;
	}
	
	public int getLastDirectionYPlayer2() {
		return lastDirectionY;
	}

}
