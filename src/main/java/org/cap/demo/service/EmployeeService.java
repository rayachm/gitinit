package org.cap.demo.service;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.cap.demo.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class EmployeeService {
	
	public List<Employee> employees= new ArrayList<>(
		Arrays.asList(
				new Employee(1,"Mahesh",10000),
				new Employee(2,"Suresh",9000),
				new Employee(3,"Manoj",11000),
				new Employee(4,"Vamsi",12000)	
				));
	
	public List<Employee>getAllEmployees(){
		return employees;
	}
	
	public Employee getEmployeeById(Integer id) {
		return employees.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	
	}

	public void createEmployee(Employee employee) {
		
		employees.add(employee);
		
	}

	public  void editEmployee(Integer id, Employee employee) {
		
		for(int i=0; i<employees.size();i++) {
			Employee e= employees.get(i);
			if(e.getId().equals(id)){
				
				employees.set(i, employee);
				return;
				
				
			}
			
		}
	}

	public void deleteEmployee(Integer id) {
//		for(int i=0; i<employees.size();i++) {
//			Employee e= employees.get(i);
//			if(e.getId().equals(id)){
//				
//				employees.remove(i);
//				return;
		employees.removeIf(e -> e.getId().equals(id));
				
				
			}
		
	}

