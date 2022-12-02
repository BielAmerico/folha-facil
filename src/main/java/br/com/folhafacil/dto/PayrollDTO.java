package br.com.folhafacil.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class PayrollDTO {

	public String referringMonth;

	public Long referringYear;

	public String nameCompany;

	public Long cnpj;

	public BigDecimal liquidSalary;

	public EmployeeDTO employee;

	@JsonProperty(value = "items")
	public List<PayrollItemDTO> payrollItems = new ArrayList<>();

	public void addItems(PayrollItemDTO item) {
		this.payrollItems.add(item);
	}

	public EmployeeDTO getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeDTO employee) {
		this.employee = employee;
	}

	public String getReferringMonth() {
		return referringMonth;
	}

	public void setReferringMonth(String referringMonth) {
		this.referringMonth = referringMonth;
	}

	public Long getReferringYear() {
		return referringYear;
	}

	public void setReferringYear(Long referringYear) {
		this.referringYear = referringYear;
	}

	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public BigDecimal getLiquidSalary() {
		return liquidSalary;
	}

	public void setLiquidSalary(BigDecimal liquidSalary) {
		this.liquidSalary = liquidSalary;
	}
}
