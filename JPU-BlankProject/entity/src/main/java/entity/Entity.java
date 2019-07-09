package entity;

/**
 * The Class Entity.
 *
 * @author Vincent Jacques
 */
public abstract class Entity {
	private int positionX;
	private int positionY;
	private Map map;
	
	/**
	 * The Entity constructor 
	 * 
	 * @param x
	 * @param y
	 */
	public Entity(final int x, int y) {
		this.positionX = x;
		this.positionY = y;
	}
	
	public Entity() {
		
	}
	
	/**
	 * The getPositionX method
	 * 
	 * @return x
	 */
	public int getPositionX() {
		return this.positionX;
	}
	
	/**
	 * The getPositionY method
	 *
	 * @return y
	 */
	public int getPositionY() {
		return this.positionY;
	}
	
	/**
	 * The setPositionX method
	 * 
	 * @param x
	 */
	public void setPositionX(int x) {
		this.positionX = x;
	}
	
	/**
	 * The setPositionY method
	 * 
	 * @param y
	 */
	public void setPositionY(int y) {
		this.positionY = y;
	}
	
	/**
	 * The setMap method
	 * Defines the map on which the entity evolves
	 * 
	 * @param map
	 */
	public void setMap(Map map) {
		this.map = map;
	}
	
	/**
	 * The getMap method
	 * 
	 * @return the map
	 */
	public Map getMap() {
		return this.map;
	}
	
	
}
