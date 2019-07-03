package mobileElements;

public class Player1 extends MobileElements {
	
	public Player1(int x, int y) {
		super(x, y);
	}
	
	public void movePlayer1(char direction) {
		switch(direction) {
		case 'Q':
			this.Move(-1, 0);
			break;
		case 'D':
			this.Move(+1, 0);
			break;
		}
	}

}
