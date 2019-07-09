package contract;


public interface IDAOWinner {
	
	/**
	 * add the winner and the time in the database
	 */
	void addWinner(String winner, float time);
	
}
