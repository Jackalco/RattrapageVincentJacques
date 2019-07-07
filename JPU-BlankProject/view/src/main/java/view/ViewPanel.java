package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import contract.IModel;
import entity.Map;
import mobileElements.Player1;
import mobileElements.Player2;
import motionLessElements.Empty;
import motionLessElements.Wall;
import motionLessElements.wallPlayer1;
import motionLessElements.wallPlayer2;
import entity.Entity;


/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;
	
	private boolean toStop = false;


	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
		viewFrame.getModel().getMap();
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		Map map = this.viewFrame.getModel().getMap();
		Entity[][] loadMap = map.getArrayMap();
		Player1 player1 = null;
		Player2 player2 = null;
		final int width = 49;
		final int height = 74;
		
		if(map.getPlayer1() != null || map.getPlayer2() != null) {
			player1 = this.viewFrame.getModel().getMap().getPlayer1();
			player2 = this.viewFrame.getModel().getMap().getPlayer2();
			Font font = new Font("Arial", Font.BOLD, 20);
			graphics.setFont(font);
			this.displayMap(graphics, width, height);
			this.infoP(graphics, map, player1, player2);
		} else {
			graphics.clearRect(0, 0, 600, 400);
		}
				

	}
	
	public void displayMap(Graphics graphics, int width, int height) {
		final int imageSize = 8;
		Map map = this.viewFrame.getModel().getMap();
		IModel getModel = this.viewFrame.getModel();
		Entity[][] loadMap = map.getArrayMap();
		Player1 player1 = this.viewFrame.getModel().getMap().getPlayer1();
		Player2 player2 = this.viewFrame.getModel().getMap().getPlayer2();
		for (int x = 0; x < 74; x++) {
			for (int y = 0; y < 46; y++) {
				if(loadMap[x][y] instanceof Wall) {
					graphics.setColor(Color.BLACK);
					graphics.fillRect(x*imageSize, y*imageSize, 8, 8);
				} else if(loadMap[x][y] instanceof Empty) {
					graphics.setColor(Color.WHITE);
					graphics.fillRect(x*imageSize, y*imageSize, 8, 8);
				} else if(loadMap[x][y] instanceof Player1) {
					graphics.setColor(Color.BLUE);
					graphics.fillRect(x*imageSize, y*imageSize, 8, 8);
				} else if(loadMap[x][y] instanceof Player2) {
					graphics.setColor(Color.RED);
					graphics.fillRect(x*imageSize, y*imageSize, 8, 8);
				} else if(loadMap[x][y] instanceof wallPlayer1) {
					graphics.setColor(Color.MAGENTA);
					graphics.fillRect(x*imageSize, y*imageSize, 8, 8);
				} else if(loadMap[x][y] instanceof wallPlayer2) {
					graphics.setColor(Color.ORANGE);
					graphics.fillRect(x*imageSize, y*imageSize, 8, 8);
				}

			}
		}
		
		if(!player1.getAlivePlayer1() &&  toStop == false) {
			toStop = true;
			graphics.clearRect(0, 0, 600, 400);
			this.viewFrame.printMessage("Congratulations Player 2, you won !");
			System.exit(0);
		}
		
		if(!player2.getAlivePlayer2() && toStop == false) {
			toStop = true;
			graphics.clearRect(0, 0, 600, 400);
			this.viewFrame.printMessage("Congratulations Player 1, you won !");
			System.exit(0);
		}
	}
	
	public void infoP(Graphics graphics, Map map, Player1 player1, Player2 player2) {
		graphics.drawString(String.valueOf("Position 1: "+ player1.getPositionX()+ " " + player1.getPositionY()), 40, 40);
		graphics.drawString(String.valueOf("Position 2: "+ player2.getPositionX()+ " " + player2.getPositionY()), 40, 60);
	}
}
