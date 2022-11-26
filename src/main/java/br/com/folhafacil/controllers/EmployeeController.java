package br.com.folhafacil.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.folhafacil.model.EmployeeEntity;
import br.com.folhafacil.services.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public EmployeeEntity save(@RequestBody EmployeeEntity employeeEntity) {
		return this.employeeService.saveEmployee(employeeEntity);		
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void delete(@PathVariable @Valid Long id) {
		this.employeeService.deleteEmployee(id);
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public EmployeeEntity findById(@PathVariable @Valid Long id) {
		return this.employeeService.findByIdEmployee(id);
	}
	
	@PutMapping
	@ResponseStatus(code = HttpStatus.OK)
	public EmployeeEntity update(@RequestBody EmployeeEntity employeeEntity) {
		return this.employeeService.updateEmployee(employeeEntity);
	}
}
