package br.com.folhafacil.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.folhafacil.model.EmployeeEntity;
import br.com.folhafacil.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
		return this.employeeRepository.save(employeeEntity);		
	}

	public void deleteEmployee(@Valid Long id) {
		this.employeeRepository.deleteById(id);
		System.out.println(">>> ID: " + id + " deletado com sucesso!");
	}

	public EmployeeEntity findByIdEmployee(@Valid Long id) {
		System.out.println(">>> ID: "+ id + " buscado com sucesso!");
		return this.employeeRepository.findById(id).get();
	}

	public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
		return this.employeeRepository.save(employeeEntity);
	}
	
}
