package edu.eci.ieti.TaskPlannerApp.entities;

public class User {
	
	private String userName;
    private String email;
    private String password;     
    private String userId;
    
	public User(String userName, String email, String password, String userId) {
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
    
	

	

}
