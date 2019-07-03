package entity;

import collisions.Collisions;
import mobileElements.Player1;
import mobileElements.Player2;
import motionLessElements.Empty;
import motionLessElements.Wall;

public class Map extends Entity {
	
	private static String contentMap = "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnonnnnnnnnnnnnnnnnnnnnnnnnntnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnw\r\n" + 
			"wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww";
	private int id;
	private Entity[][] mapToChars;
	private Collisions collisions;
	
	public Map(final int id, final String content) {
		this.setId(id);
		this.setContentMap(content);
		this.createMap();
	}
	
	public Map() {
		this(1, contentMap);
	}
	
	public String getContentMap() {
		return this.contentMap;
	}
	
	public void setContentMap(final String content) {
		this.contentMap = content;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(final int id) {
		this.id = id;
	}

	public Collisions getCollisions() {
		return collisions;
	}
	
	public void setCollisions(Collisions collisions) {
		this.collisions = collisions;
	}
	
	public void createMap() {
		String map = this.getContentMap();
		int HeightMap = 49;
		int WidthMap = 74;
		this.mapToChars = new Entity[WidthMap][HeightMap];
		for (int y = 0; y < HeightMap; y++) {
			String[] finalMap = map.split("\n");
			for (int x = 0; x < WidthMap; x++) {
				switch (finalMap[y].toCharArray()[x]) {
				case 'w':
					mapToChars[x][y] = new Wall(x,y);
					break;
				case 'n':
					mapToChars[x][y] = new Empty(x,y);
					break;
				case 'o':
					mapToChars[x][y] = new Player1(x,y);
					break;
				case 't':
					mapToChars[x][y] = new Player2(x,y);
					break;
				default:
					break;
				}
				mapToChars[x][y].setMap(this);
			}
		}
	}
	
	public Entity[][] getArrayMap() {
		return this.mapToChars;
	}
	
	public Player1 getPlayer1() {
		Entity[][] entity = this.getArrayMap();
		for (int y = 0; y < 49; y++) {
			for (int x = 0; x < 74; x++) {
				if (entity[x][y] instanceof Player1) {
					return (Player1) entity[x][y];
				}
			}
		}
		return null;
	}
	
	public Player2 getPlayer2() {
		Entity[][] entity = this.getArrayMap();
		for (int y = 0; y < 49; y++) {
			for (int x = 0; x < 74; x++) {
				if (entity[x][y] instanceof Player2) {
					return (Player2) entity[x][y];
				}
			}
		}
		return null;
	}

}
