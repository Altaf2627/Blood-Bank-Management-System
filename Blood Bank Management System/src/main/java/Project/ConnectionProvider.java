package Project;
import java.sql.*;

public class ConnectionProvider {
	public static Connection getCon()
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/bloodbank","postgres","12345678");
			
			return con;
		}
		catch(Exception e)
		{
			System.out.print(e);
			return null;
			
		}
	}
}
