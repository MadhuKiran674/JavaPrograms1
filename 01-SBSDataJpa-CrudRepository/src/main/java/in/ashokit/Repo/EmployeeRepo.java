package in.ashokit.Repo;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import in.ashokit.entity.Employee;
@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
