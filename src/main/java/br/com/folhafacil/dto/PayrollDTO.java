package br.com.folhafacil.dto;

import java.math.BigDecimal;

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

	public String descripiton;

	public BigDecimal discounts;

	public EmployeeDTO employee;
	
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

	public String getDescripiton() {
		return descripiton;
	}

	public void setDescripiton(String descripiton) {
		this.descripiton = descripiton;
	}

	public BigDecimal getDiscounts() {
		return discounts;
	}

	public void setDiscounts(BigDecimal discounts) {
		this.discounts = discounts;
	}
}
