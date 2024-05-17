package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.Repo.EmployeeRepo;
import in.ashokit.entity.Employee;
@Service
public class EmployeeService {
	private EmployeeRepo empRepo;

	public EmployeeService(EmployeeRepo empRepo) {
		
		this.empRepo = empRepo;
		System.out.println(this.empRepo.getClass().getName());
	}
	
	public void saveEmployee() {
		Employee emp=new Employee();
		emp.setEmpId(101);
		emp.setEmpName("kiran");
		emp.setSalary(15000.00);
		emp.setDept("sales");
		
		empRepo.save(emp);
	}
	
	public void getAllemp() {
		Iterable<Employee> lis=empRepo.findAll();
		lis.forEach(System.out::println);
	}
	public void getemps() {
		List<Integer> eml=Arrays.asList(102,103);
		Iterable<Employee> list=empRepo.findAllById(eml);
		list.forEach(System.out::println);
	}
	
	public void getemp() {
		Optional<Employee> findbyId=empRepo.findById(101);
		if(findbyId.isPresent()) {
			Employee emp=findbyId.get();
			System.out.println(emp);
		}

	}
	
	
	
	
	
	
	public void savemulEmp() {
		Employee emp1=new Employee();
		emp1.setEmpId(102);
		emp1.setEmpName("Durga");
		emp1.setSalary(20000.00);
		emp1.setDept("sales");
		
		Employee emp2=new Employee();
		emp2.setEmpId(103);
		emp2.setEmpName("madhu");
		emp2.setSalary(318.99);
		emp2.setDept("admin");
		List<Employee>emplist=Arrays.asList(emp1,emp2);
		empRepo.saveAll(emplist);
	}
	

}
