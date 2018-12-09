package Imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import DBUtilities.IUtilities;

public class ProcessData implements IUtilities{

	
	public static Statement statement = null;
	public ResultSet resultSet = null;
	public static Connection connect = null;
	public PreparedStatement preparedStatement = null;
	
	
	public ProcessData() {
		try {
			connect = DriverManager.getConnection("jdbc:mysql://localhost/bootcamp", "root", "");
			System.out.println("Login Suscces");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Disconnecting() throws Exception {
		// TODO Auto-generated method stub
		if (connect != null) {
			connect.close();
			System.out.println("connection Closed");
		} else {
			System.out.println("connection has been Disable");
		}
	}
	
	public void ExecutePreStatementSql(String sql) throws Exception{
//		preparedStatement = connect.prepareStatement(sql);
		preparedStatement.executeUpdate();
	}
	
	
	@Override
	public ResultSet ReadRecordData(String sql) throws Exception {
		// TODO Auto-generated method stub
		statement = connect.createStatement();
		resultSet = statement.executeQuery(sql);
		
		return resultSet;
	}

	@Override
	public void ExecuteSqlStatement(String sql) throws Exception {
		// TODO Auto-generated method stub
		statement = connect.createStatement();
		statement.executeUpdate(sql);
	}

}
