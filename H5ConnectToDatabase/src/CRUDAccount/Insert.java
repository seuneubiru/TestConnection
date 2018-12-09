package CRUDAccount;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

import DBUtilities.ICRUD;
import Imp.ProcessData;
import Model.Account;

public class Insert extends ProcessData implements ICRUD {

	@Override
	public void Data() throws ParseException, SQLException, Exception {
		// TODO Auto-generated method stub
		Date oDate;
		BigDecimal balance;
		int id;
		Account aC = new Account();
		Scanner in = new Scanner(System.in);
		Scanner an = new Scanner(System.in);
		Scanner en = new Scanner(System.in);
		System.out.print("Input Date\t= ");
		oDate = Date.valueOf(en.nextLine());
		System.out.print("Insert your Balance\t= ");
		balance = in.nextBigDecimal();
		System.out.println("Insert your Account Customer\t= ");
		id = an.nextInt();
		
		String Sql = "insert into account (OpenDate,Balance,id_customer) Values (?,?,?);";
		
		preparedStatement = connect.prepareStatement(Sql);
		
		preparedStatement.setDate(1, oDate);
		preparedStatement.setBigDecimal(2, balance);
		preparedStatement.setInt(3, id);
		
		ExecutePreStatementSql(Sql);
	}
}
