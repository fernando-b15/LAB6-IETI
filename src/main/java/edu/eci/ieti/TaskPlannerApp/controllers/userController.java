package edu.eci.ieti.TaskPlannerApp.controllers;

import java.util.List;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.ieti.TaskPlannerApp.entities.User;
import edu.eci.ieti.TaskPlannerApp.services.UserService;

@RestController
@RequestMapping("users")
public class userController {
	
	@Autowired
	UserService userService;

	public userController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping (method = RequestMethod.GET )
	public ResponseEntity<?>  getAllUsers(){
		try{
			List<User> users = userService.getAll();
			return new ResponseEntity<>(users, HttpStatus.ACCEPTED);
		}catch (Exception e){
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	   }
	}
	@RequestMapping(path ="/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getUsuarioByNick(@PathVariable ("id") String idUser){
            return new ResponseEntity<>(userService.getById(idUser),HttpStatus.ACCEPTED);

    }
	@PostMapping("/newuser")
	public ResponseEntity<?> newUser(@RequestBody User user){
		userService.create(user);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	@PutMapping("/updateuser")
    public ResponseEntity<?> updateUser(@RequestBody User user){
        return new ResponseEntity<>(userService.update(user),HttpStatus.ACCEPTED);
    }
	@DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delteUser(@PathVariable String idUser){
		userService.remove(idUser);
        return new  ResponseEntity<>(HttpStatus.ACCEPTED);
    }


}
