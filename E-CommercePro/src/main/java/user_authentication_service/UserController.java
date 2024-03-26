package user_authentication_service;

public class UserController {
	 private UserService userService;

	    public UserController(UserService userService) {
	        this.userService = userService;
	    }

	    public boolean loginUser(String username, String password) {
	        return userService.loginUser(username, password);
	    }

	    public void registerUser(User user) {
	        userService.registerUser(user);
	    }
}
