package in.ashokit.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	private double salary;
	private String dept;
	
	
	public Employee() {
		
	}
	public Employee(Integer empId, String empName, double salary, String dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dept = dept;
	}

	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
	
	

}
