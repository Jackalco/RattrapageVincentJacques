package model;

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
	private IDAOWinner daoWinner;
	public String winner;


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
		this.modelNotify();
		}
	}
	
	public IDAOWinner getDAOWinner() {
		return this.daoWinner;
	}

	@Override
	public void isWinner(int number) {
		if(number == 1) {
			this.setWinner("Player_1");
			this.getDAOWinner().addWinner(winner);
		} else if(number == 2) {
			this.setWinner("Player_2");
			this.getDAOWinner().addWinner(winner);
		}
	}
	
	public String getWinner() {
		System.out.println(winner);
		return this.winner;
	}
	
	public void setWinner(String winner) {
		this.winner = winner;
	}


}
