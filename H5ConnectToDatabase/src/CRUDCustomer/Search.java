package CRUDCustomer;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;
import DBUtilities.ICRUD;
import Imp.ProcessData;

public class Search extends ProcessData implements ICRUD {

	@Override
	public void Data() throws ParseException, SQLException, Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String uName;
		System.out.println("===========Cari Data==========");
		System.out.println("Masukan UserName\t= ");
		uName = in.nextLine();
		
		System.out.println("\n\n");
		String sql = "Select *from Customer where username = '"+uName+"';";
		
		resultSet = ReadRecordData(sql);
		if (resultSet.next()) {
			ResultSetMetaData metadata = resultSet.getMetaData();
			
			int columnOfNumber = metadata.getColumnCount();
			
			for (int i = 1; i <= columnOfNumber; i++) {
				System.out.printf("%-8s\t",metadata.getColumnLabel(i));
			}
			System.out.println();
			do {
				for (int i = 1; i <= columnOfNumber; i++) {
					System.out.printf("%-8s\t",resultSet.getObject(i));
				}
				System.out.println();
			} while (resultSet.next());
		}else {
			System.out.println("Data Tidak Ada");
		}
		
	}
	
}
