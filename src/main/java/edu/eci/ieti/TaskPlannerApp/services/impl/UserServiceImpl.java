package edu.eci.ieti.TaskPlannerApp.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.eci.ieti.TaskPlannerApp.entities.User;
import edu.eci.ieti.TaskPlannerApp.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private List<User> Users = new ArrayList<User>();

	public UserServiceImpl() {
		this.Users.add(new User("fernando barrera","fernando@mail.com","ieti123","1"));
		this.Users.add(new User("luis jaramillo","luis@mail.com","ieti123","2"));
		this.Users.add(new User("carlos castañeda","carlos@mail.com","ieti123","3"));
		
	}

	@Override
	public List<User> getAll() {
		return this.Users;
	}

	@Override
	public User getById(String userId) {
		User user = null;
		for(User u:this.Users) {
			if((u.getUserId()).equals(userId)) {
				user=u;
			}
		}
		return user;
	}

	@Override
	public User create(User user) {
		this.Users.add(user);
		return user;
	}

	@Override
	public User update(User user) {
		User userUpdate = this.getById(user.getUserId());
		userUpdate.setUserName(user.getUserName());
		userUpdate.setEmail(user.getEmail());
		userUpdate.setPassword(user.getPassword());
		return userUpdate;
	}

	@Override
	public void remove(String userId) {
		User user = this.getById(userId);
		this.Users.remove(user);
		
	}

}
