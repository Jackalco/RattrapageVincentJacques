package entity;

/**
 * The Class Entity.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Entity {
	private int positionX;
	private int positionY;
	private Map map;
	
	public Entity(final int x, int y) {
		this.positionX = x;
		this.positionY = y;
	}
	
	public Entity() {
		
	}
	
	public int getPositionX() {
		return this.positionX;
	}
	
	public int getPositionY() {
		return this.positionY;
	}
	
	public void setPositionX(int x) {
		this.positionX = x;
	}
	
	public void setPositionY(int y) {
		this.positionY = y;
	}
	
	public void setMap(Map map) {
		this.map = map;
	}
}
