package learn.javaFullStack.firstProj.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learn.javaFullStack.firstProj.exception.UserNotFoundException;
import learn.javaFullStack.firstProj.model.Employee;
import learn.javaFullStack.firstProj.repo.EmployeeRepo;

@Service
public class EmployeeService {
	private final EmployeeRepo employeeRepo;

	@Autowired
	public EmployeeService(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	public Employee addEmployee(Employee employee) {
		employee.setEmpCode(UUID.randomUUID().toString());
		return employeeRepo.save(employee);
	}

	public List<Employee> findAllEmployees() {
		return employeeRepo.findAll();
	}

	public Employee updateEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	public Optional<Employee> findEmployeeById(Long id) {
		if (employeeRepo.existsById(id)) {
			return employeeRepo.findEmployeeById(id);
		}
		else {
			new UserNotFoundException("User by id:"+ id + "was not found" );
			return Optional.empty();
		}
	}

	public void deleteEmployee(Long id) {
		employeeRepo.deleteEmployeeById(id);
	}
}
