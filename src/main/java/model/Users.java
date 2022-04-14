
package model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity		
public class Users {
	@Id			
	private int emp_id;
	private String user_Name;
	private String email_Id;
	private String department;
	private String role;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int emp_id, String user_Name, String email_Id, String department, String role) {
		super();
		this.emp_id = emp_id;
		this.user_Name = user_Name;
		this.email_Id = email_Id;
		this.department = department;
		this.role = role;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getEmail_Id() {
		return email_Id;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setActive(boolean isActive) {
		// TODO Auto-generated method stub
		
	}
	

}
