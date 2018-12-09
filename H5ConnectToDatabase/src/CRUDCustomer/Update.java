package CRUDCustomer;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;
import DBUtilities.ICRUD;
import Imp.ProcessData;

public class Update extends ProcessData implements ICRUD {

	@Override
	public void Data() throws ParseException, SQLException, Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Scanner an = new Scanner(System.in);
		int id;
		String bNama,bPasswrd;
		
		System.out.println("=====================================");
		System.out.print("Masukan Account Number = ");
		id = an.nextInt();
		System.out.print("Masukan Nama Baru = ");
		bNama = in.nextLine();
		System.out.print("Masukan PassWord Baru = ");
		bPasswrd = in.nextLine();
		System.out.println("=====================================");
		
		String sql = "update customer set UserName = '"+bNama+"', password = '"+bPasswrd+"' where CustomerNumber = "+id+";";
		
		ExecuteSqlStatement(sql);
	}

}
