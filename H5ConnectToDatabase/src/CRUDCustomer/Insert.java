package CRUDCustomer;

import java.sql.Date;
//import java.text.DateFormat;
//import java.text.Format;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DBUtilities.ICRUD;
import Imp.ProcessData;
import Model.Customer;



public class Insert implements ICRUD{

	
//	private PreparedStatement preparedStatement = null;
	@Override
	public void Data() throws Exception {
		List<Customer> dataCust = new ArrayList<Customer>();
		
		Scanner in = new Scanner(System.in);
		
		Customer model = new Customer();
		
		// TODO Auto-generated method stub
		System.out.println("=======================================");
		System.out.println("\tPlease Insert Your Data");
		System.out.print("1.\tInsert Your FirstName\t= ");
		String fName = in.nextLine();
		System.out.print("2.\tInsert Your LastName\t= ");
		String lName = in.nextLine();
		System.out.print("3.\tInsert Your BirthDate\t= ");
		String dBirth = in.nextLine();
		java.sql.Date tgl = Date.valueOf(dBirth);
		//2019-10-20
		System.out.print("4.\tInsert your UserName\t= ");
		String uName = in.nextLine();
		System.out.print("5.\tInsert Password\t= ");
		String pword = in.nextLine();
		System.out.print("6.\tInsert PhoneType\t= ");
		String pType = in.nextLine();
		System.out.print("7.\tInsert PhoneNumber\t= ");
		String pNumber = in.nextLine();
		
		model.setFirstName(fName);
		model.setLastName(lName);
		model.setBirthDate(tgl);
		model.setUserName(uName);
		model.setPasswd(pword);
		model.setPhoneType(pType);
		model.setPhoneNumber(pNumber);
		dataCust.add(model);
		
		ProcessData pD = new ProcessData();
		String sql = "insert into Customer (FirstName,LastName,BirthDate,UserName,Password,PhoneType,PhoneNumber) Values "+
					"('"+fName+"','"+lName+"','"+tgl+"','"+uName+"','"+pword+"','"+pType+"','"+pNumber+"');";
//		String sql = "insert into Customer (FirstName,LastName,BirthDate,UserName,Password,PhoneType,PhoneNumber) Values (?,?,?,?,?,?,?);";
//		preparedStatement = (PreparedStatement) new ProcessData();
//		
//		preparedStatement.executeQuery(sql);
		
		pD.ExecuteSqlStatement(sql);
	}	
}
