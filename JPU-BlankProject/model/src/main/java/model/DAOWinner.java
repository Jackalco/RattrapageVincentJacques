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
	
	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	protected Connection getConnection() {
		return this.connection;
	}

	/**
	 * add the winner and the time in the database
	 */
	public void addWinner(String winner, float time) {
		try {
			final String sql = "{call addWinner(?,?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setString(1, winner);
			call.setFloat(2, time);
			call.execute();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

}
