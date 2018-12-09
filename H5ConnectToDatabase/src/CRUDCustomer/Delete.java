package CRUDCustomer;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;
import DBUtilities.ICRUD;
import Imp.ProcessData;

public class Delete extends ProcessData implements ICRUD {

	@Override
	public void Data() throws ParseException, SQLException, Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Scanner an = new Scanner(System.in);
		String nama;
		int id;
		System.out.println("======================================");
		System.out.print("Masukan Account Number yang akan ");
		id = in.nextInt();
		System.out.print("masukan Nama yang akan di hapus : ");
		nama = an.nextLine();
		System.out.println("======================================");
		
		String sql = "Delete from customer where CustomerNumber = "+id+" and FirstName = '"+nama+"';";
		
		ExecuteSqlStatement(sql);
		
	}

	

}
