package DBServices;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import user_authentication_service.User;


public class DB {
	Connection con ;
	Statement st;
	ResultSet rs;
	public  Connection connectDB() {
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver : OK...");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/not_important","root","");
			System.out.println("connection : OK...");
			

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}

	public void insertData(User user) {
		try {
			st=con.createStatement();
			st.executeUpdate("insert into user (Username,Email,Password,Gender) "
					+ "values ('"+user.getusername()+"','"+user.getpassword()+"')");
			System.out.println("insertion completed...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
//	public boolean checklogin(User user) {
//	boolean check=false;
//		try {
//			st =con.createStatement();
//			st.executeQuery("Select * from user where Username='"+user.getname()+"' and Password='"+user.getpassword()+"'");
//			 rs=st.getResultSet();
//			String dbname;
//			String dbpassword;
//			String dbemail;
//			String dbgender;
//			while(rs.next()) {
//			 dbname=rs.getString("Username");
//			 dbpassword=rs.getString("Password");
//			 dbemail=rs.getString("Email");
//			 dbgender=rs.getString("Gender");
//	//		System.out.println(dbname+" : "+dbpassword);
//			
//			if(user.getname().equals(dbname)&&user.getpassword().equals(dbpassword)) {
//				System.out.println("login succeed...");
//				user.setname(dbname);
//				user.setemail(dbemail);
//				user.setpassword(dbpassword);
//				user.setgender(dbgender);
//	//			res.sendRedirect("home.jsp");
//				check=true;
//			}
//			else {
//				System.out.println("login failed");
//				
//			}
//		}
//	}
//	catch(SQLException e) {
//		e.printStackTrace();
//	}
//		return check;
//	}
}
