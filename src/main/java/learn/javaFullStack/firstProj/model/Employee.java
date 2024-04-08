package learn.javaFullStack.firstProj.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false,updatable=false)
	private Long id;
	private String Name;
	private String Email;
	private String JobTitle;
	private String Phone;
	private String ImageUrl;
	@Column(nullable=false,updatable=false)
	private String EmpCode;
	
//	constructors
	
	public Employee() {
	}
	
	public Employee(Long iD, String name, String email, String jobTitle, String phone, String imageUrl,
			String empCode) {
		id = iD;
		Name = name;
		Email = email;
		JobTitle = jobTitle;
		Phone = phone;
		ImageUrl = imageUrl;
		EmpCode = empCode;
	}
	
//	getters and setters
	
	public Long getid() {
		return id;
	}
	public void setid(Long iD) {
		id = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getImageUrl() {
		return ImageUrl;
	}
	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}
	public String getEmpCode() {
		return EmpCode;
	}
	public void setEmpCode(String empCode) {
		EmpCode = empCode;
	}

//	to string method incase to print the values in the class
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Email=" + Email + ", JobTitle=" + JobTitle + ", Phone="
				+ Phone + ", ImageUrl=" + ImageUrl + ", EmpCode=" + EmpCode + "]";
	}
	
	
	
}
