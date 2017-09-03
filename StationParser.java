package metro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.StringTokenizer;



public class StationParser {

	public static void main(String[] args) {
		
		Connection con = null;
		String query = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			con =DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/metro_db","root","");  
			 query = " insert into station_info (SID, SNAME,X,Y)"
				        + " values (?, ?, ?, ?)";		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		File file = new File("station_data.txt");
		
		try(FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader)){
			String line = null;
			while((line = bufferedReader.readLine())!=null)
			{
				String arr[] = line.split(",");
				
				PreparedStatement preparedStatement = con.prepareStatement(query);
				preparedStatement.setInt(1,Integer.parseInt(arr[0]));
				preparedStatement.setString(2,arr[1]);
				preparedStatement.setInt(3, Integer.parseInt(arr[2]));
				preparedStatement.setInt(4, Integer.parseInt(arr[3]));
				preparedStatement.execute();
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
