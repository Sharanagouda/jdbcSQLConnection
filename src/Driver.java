import java.sql.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","sharanu","sharanu");
		Statement stmt=con.createStatement();
	
		ResultSet res=stmt.executeQuery("Select * from users");
		while(res.next()){
			System.out.println(res.getString("name")+","+res.getString("age"));
		}
		} catch (Exception exc) {
exc.printStackTrace();
		}
	}

}
