package br.com.folhafacil.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.folhafacil.dto.PayrollDTO;
import br.com.folhafacil.model.EmployeeEntity;
import br.com.folhafacil.model.PayrollEntity;
import br.com.folhafacil.repository.EmployeeRepository;
import br.com.folhafacil.repository.PayrollRepository;

@Service
public class PayrollService {

	@Autowired
	private PayrollRepository payrollRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ObjectMapper mapper;

	public PayrollEntity savePayroll(PayrollDTO payrollDto) {
		
		
		EmployeeEntity employee = this.employeeRepository.findById(payrollDto.employeeId).get();
		
		PayrollEntity savedPayroll = new PayrollEntity();
		
		return this.payrollRepository.save(savedPayroll);
	}

	public void deletePayroll(@Valid Long id) {
		this.payrollRepository.deleteById(id);

	}

	public PayrollEntity findByIdPayroll(@Valid Long id) {
		return this.payrollRepository.findById(id).get();
	}

	public PayrollEntity updatePayroll(PayrollEntity payrollEntity) {
		return this.payrollRepository.save(payrollEntity);
	}
}
