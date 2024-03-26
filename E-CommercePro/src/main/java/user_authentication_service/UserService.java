package user_authentication_service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DBServices.DB;

public class UserService {

   
    Statement st;
	ResultSet rs;
	Connection con ;

    public UserService() {
        DB db=new DB();
         db.connectDB();
    }
 
	public void registerUser(User user) {
		// Perform validation, password hashing, and save user to database
        // userRepository.save(new User(username, hashedPassword));
 
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
    
	public boolean loginUser(String username, String password) {
        User user =new User();
        if (user != null && user.getpassword().equals(password)) {
            return true;
        }
        return false;
    }
}
