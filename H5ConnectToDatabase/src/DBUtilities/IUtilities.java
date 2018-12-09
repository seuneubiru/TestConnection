package DBUtilities;

import java.sql.ResultSet;

public interface IUtilities {
	
	void Disconnecting() throws Exception;
	ResultSet ReadRecordData(String sql) throws Exception;
	void ExecuteSqlStatement(String sql) throws Exception;
	
	
}
