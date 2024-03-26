package user_authentication_service;

public class User {
	private String username;
    private String password;
    
    public void setusername(String username) {
    	this.username=username;
    }
    public void setpassword(String password) {
    	this.password=password;
    }
    
    public String getusername() {
    	return username;
    }
    public String getpassword() {
    	return password;
    }
}
