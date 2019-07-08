package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import contract.IDAOWinner;
import contract.IModel;

/**
 * The Class DAOWinner
 * 
 * @author Vincent Jacques
 */

public class DAOWinner implements IDAOWinner {
	
	/** The connection. */
	private final Connection connection;
	
	private IModel model;

	/**
	 * Instantiates a new DAO winner.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	
	public DAOWinner(final Connection connection) throws SQLException {
		this.connection = connection;
	}
	
	protected Connection getConnection() {
		return this.connection;
	}


	public void addWinner(final String winner) {
		try {
			final String sql = "{call addWinner(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setString(1, winner);;
			call.execute();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/*public String getWinner() {
		System.out.println(winner);
		return this.winner;

	}*/
	
	public IModel getModel() {
		return this.model;
	}



}
