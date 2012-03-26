
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;


public class DBManager {

	private Connection myConnection;
	
	public void dbDisconnect(){
		try {
			if(myConnection != null) {
				myConnection.close();
			}
		} catch (SQLException e) {
			System.err.println("DisconnectFromDataBase failed: " + e);
		}
	}


	public boolean dbConnect() {
		boolean connected = false;
	     
		String serverName= "db-und.ida.liu.se";
		String myDB= "remgu983";
		String serverURL= "jdbc:mysql://"+serverName+"/"+myDB;
		String username="remgu983";
		String password="remgu983e6b4"; 
	     
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			myConnection = DriverManager.getConnection (serverURL, username, password);
			myConnection.setAutoCommit(true);
			connected = true;
		} catch (Exception e) {
			System.err.println("setupDataBase failed: " + e);
		}
	
		return connected;
	}
	   
	public ArrayList<Hashtable<String, String>> executeQuery(String sql) {

		Statement statement;
		ResultSet resSet;
		ArrayList<Hashtable<String, String>> contentArr = new ArrayList<Hashtable<String, String>>();

		try {
			// Create a statement, execute the query and get resultSet
			statement = myConnection.createStatement();
			statement.execute(sql);
			resSet = statement.getResultSet();
			
			// Get the meta data of the ResultSet
			ResultSetMetaData meta = resSet.getMetaData();
			int cols = meta.getColumnCount();

			while(resSet.next() ){
				
				// Put each line in a Hashtable => ht[KEY] = value
				Hashtable<String, String> ht = new Hashtable<String, String>();               
				for(int i = 1 ; i<= cols ; i++){
					Object value = resSet.getObject(i);
					if( value!= null){
						ht.put(meta.getColumnName(i), value.toString());
					}
				}
				// Add the Hashtab to the final ArrayList
				contentArr.add(ht);
			}
		} catch (NullPointerException npe) {
			return null;
		} catch (SQLException e) {
			System.err.println("executeQuery failed: " + e);
		}
		// Return the content Array List
		return contentArr;
	}
	
}
