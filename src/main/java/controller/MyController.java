
package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import dao.UserRepository;
import model.Users;

@RestController
public class MyController {
	
	@Autowired
	UserRepository repo;
	
	//Testing Request
	@GetMapping("/")
	public String welcome() {
		System.out.println("Welcome");
		return "Welcome to console";
	}
	//Getting Users list	//Is Working fine
	@GetMapping("/Users")
	public List<Users> getAllUsers(){
		return repo.findAll();
	}
	
	//Adding User is working fine
	@PostMapping("addUsers")
	public String addUser(@RequestBody Users Users) {
		repo.save(Users);  
		return Users.getEmp_id()+" Added successfully";
	}
	
	//Get User by Id
	@GetMapping("ById")
	public Users search(int emp_id) {
        return repo.findById(emp_id).get();
    }
	@DeleteMapping("/Delete")
	public Boolean delete(int emp_id) {
		repo.deleteById(emp_id);
		return true;
	}
	@PutMapping("/Update")
	public Users update(Users Users) {
		return repo.save(Users);
		
	}
	
	
}
