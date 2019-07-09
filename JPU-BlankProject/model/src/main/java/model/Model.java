package model;

import java.sql.SQLException;
import java.util.Observable;

import contract.IDAOWinner;
import contract.IModel;
import entity.Map;

/**
 * The Class Model.
 *
 * @author Vincent Jacques
 */
public class Model extends Observable implements IModel {


	private Map map;
	private IDAOWinner IdaoWinner;
	public String winner;
	public float time;


	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.map = new Map();
	}

	/**
     * Gets the map.
     *
     * @return the map
     */

	public Map getMap() {
		return this.map;
	}

	/**
     * Gets the observable.
     *
     * @return the observable
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}


	public void modelNotify() {
		setChanged();
		notifyObservers();		
	}

	public void loop() {
		if(this.getMap().getPlayer1() != null && this.getMap().getPlayer2() != null) {
		this.getMap().loop();
		this.startTimer();
		this.modelNotify();
		}
	}
	
	/**
	 * gets the DAOWinner
	 * 
	 * @return the DAOWinner
	 */
	
	public IDAOWinner getDAOWinner() {
		return this.IdaoWinner;
	}

	public void isWinner(int number) {
		if(number == 1) {
			this.setWinner("Player_1");
			try {
				final DAOWinner daoWinner = new DAOWinner(DBConnection.getInstance().getConnection());
				daoWinner.addWinner(this.getWinner(), this.getTime());
			} catch (final SQLException e) {
				e.printStackTrace();
			}

		} else if(number == 2) {
			this.setWinner("Player_2");
			try {
				final DAOWinner daoWinner = new DAOWinner(DBConnection.getInstance().getConnection());
				daoWinner.addWinner(this.getWinner(), this.getTime());
			} catch (final SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public String getWinner() {
		return this.winner;
	}
	
	/**
	 * sets the Winner
	 * 
	 * @param winner
	 */
	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	 /**
	  * gets the Time
	  * 
	  * @return the time
	  */
	public float getTime() {
		return this.time;
	}
	
	public void setTime(float time) {
		this.time = time;
	}
	
	/**
	 * start the time when both players are alive
	 */
	
	public void startTimer() {
		if(this.getMap().getPlayer1().getAlivePlayer1() == true && this.getMap().getPlayer2().getAlivePlayer2() == true) {
			this.setTime(time += 0.1);
		}
	}


}
