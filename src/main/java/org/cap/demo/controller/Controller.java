package org.cap.demo.controller;

import java.util.List;

import org.cap.demo.Employee;
import org.cap.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	    @Autowired
	    private EmployeeService employeeService;
		@RequestMapping("/getAllEmployees")
		public List<Employee>getAllTodos(){
			return employeeService.getAllEmployees();
			
		}
		
		@RequestMapping("/getemployeeById/{id}")
		public Employee getEmployeeById(@PathVariable Integer id)
		{
			return employeeService.getEmployeeById(id);
		}
		
		@RequestMapping(method=RequestMethod.POST, value="employee")
		public void createEmployee(@RequestBody Employee employee) {
			employeeService.createEmployee(employee);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/edit/{id}")
		public void editEmployee(@PathVariable Integer id, @RequestBody Employee employee) {
			employeeService.editEmployee(id,employee);
		}
		
		@RequestMapping(method=RequestMethod.DELETE, value="/delete/{id}")
		public void deleteEmployee(@PathVariable Integer id) {
			employeeService.deleteEmployee(id);
		}
		

	}

