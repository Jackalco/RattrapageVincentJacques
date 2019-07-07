package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import mobileElements.MobileElements;

public class DAOWinner{
	
	/** The connection. */
	private final Connection connection;

	
	public DAOWinner(final Connection connection) throws SQLException {
		this.connection = connection;
	}
	
	protected Connection getConnection() {
		return this.connection;
	}


	public MobileElements addWinner(String winner) {
		try {
			final String sql = "{call addWinner(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setString(1, winner);
			call.execute();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}



}
