package br.com.folhafacil.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.Month;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.folhafacil.TypeTax;
import br.com.folhafacil.dto.EmployeeDTO;
import br.com.folhafacil.dto.PayrollDTO;
import br.com.folhafacil.helper.CompanyHelper;
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
	private TaxCalculatorService taxCalculatorService;
	
	@Autowired
	private ObjectMapper mapper;

	
	public PayrollDTO generatePayrollByEmployee(Long id) throws JsonProcessingException {
	
		EmployeeEntity employee = this.employeeRepository.findById(id).get();
		
		PayrollEntity newPayroll = new PayrollEntity();
		
		newPayroll.setEmployee(employee);
		newPayroll.setCnpj(CompanyHelper.CNPJ);
		newPayroll.setNameCompany(CompanyHelper.NAME);
		newPayroll.setBaseSalary(employee.getBaseSalary());
		
		Month referringMonth = LocalDateTime.now().getMonth();
		newPayroll.setReferringMonth(referringMonth.name());
		System.out.println("Mes referente: " + referringMonth.name());
		
		Integer referringYear = LocalDateTime.now().getYear();
		newPayroll.setReferringYear(referringYear);
		System.out.println("Ano referente: " + referringYear);
		
		BigDecimal baseSalaryEmployee = employee.getBaseSalary().setScale(2, RoundingMode.CEILING);

		BigDecimal discount = this.taxCalculatorService.calculateTax(TypeTax.INSS, baseSalaryEmployee);
		newPayroll.setDiscounts(discount);
		newPayroll.setDescripiton("INSS");
		
		BigDecimal liquidSalary = baseSalaryEmployee.subtract(discount).setScale(2, RoundingMode.CEILING);
		newPayroll.setLiquidSalary(liquidSalary);
		
		this.payrollRepository.save(newPayroll);
		
		PayrollDTO payrollDto = this.mapper.convertValue(newPayroll, PayrollDTO.class);
		payrollDto.setEmployee(this.mapper.convertValue(employee, EmployeeDTO.class));
		
		return payrollDto;
	}
	
	public void deletePayroll(Long id) {
		this.payrollRepository.deleteById(id);

	}

	public PayrollEntity findByIdPayroll(@Valid Long id) {
		return this.payrollRepository.findById(id).get();
	}

	public PayrollEntity updatePayroll(PayrollEntity payrollEntity) {
		return this.payrollRepository.save(payrollEntity);
	}
}
