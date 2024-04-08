package learn.javaFullStack.firstProj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import learn.javaFullStack.firstProj.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	void deleteEmployeeById(Long id);

	Employee findEmployeeById(Long id);

}
