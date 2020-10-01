package edu.eci.ieti.TaskPlannerApp.services;

import java.util.List;

import edu.eci.ieti.TaskPlannerApp.entities.User;

public interface UserService {
	
    List<User> getAll();
    
    User getById(String userId);
    
    User create(User user);
    
    User update(User user);
    
    void remove(String userId);
}
