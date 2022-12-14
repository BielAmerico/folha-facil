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

import com.google.gson.Gson;

import br.com.folhafacil.dto.PayrollDTO;
import br.com.folhafacil.model.EmployeeEntity;
import br.com.folhafacil.model.PayrollEntity;
import br.com.folhafacil.services.PayrollService;

@RestController
@RequestMapping("/payroll")
public class PayrollController {
	
	@Autowired
	public PayrollService payrollService;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public PayrollEntity save(@RequestBody PayrollDTO payroll) {
		Gson gson = new Gson();
		System.out.println("\n >>> Request recebida.");
		System.out.println(">>> Conteudo recebido: " + gson.toJson(payroll));
		
		return this.payrollService.savePayroll(payroll);	
	}


	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void delete(@PathVariable @Valid Long id) {
		
		System.out.println("\n >>> ID recebido: " + id);
		
		this.payrollService.deletePayroll(id);
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public PayrollEntity findById(@PathVariable @Valid Long id) {
		return this.payrollService.findByIdPayroll(id);
	}
	
	@PutMapping
	@ResponseStatus(code = HttpStatus.OK)
	public PayrollEntity update(@RequestBody PayrollEntity payrollEntity) {
		return this.payrollService.updatePayroll(payrollEntity);
	}
	
}
