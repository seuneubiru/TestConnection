package CRUDCustomer;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;

import DBUtilities.ICRUD;
import Imp.ProcessData;

public class View extends ProcessData implements ICRUD {

	@Override
	public void Data() throws ParseException, SQLException, Exception {
		// TODO Auto-generated method stub
		
		String sql = "select * from customer";
		
		resultSet = ReadRecordData(sql);
		
		if (resultSet.next()) {
			
			ResultSetMetaData metaData = resultSet.getMetaData();
			
			int columnOfNumber = metaData.getColumnCount();
			
			for (int i = 1; i <= columnOfNumber; i++) {
				System.out.printf("%-8s\t",metaData.getColumnName(i));
			}
			System.out.println();
			do {
				for (int i = 1; i <= columnOfNumber; i++) {
					System.out.printf("%-8s\t",resultSet.getObject(i));
				}
				System.out.println();
			} while (resultSet.next());
		}else {
			System.out.println("Data Not Found");
		}	
	}
}
