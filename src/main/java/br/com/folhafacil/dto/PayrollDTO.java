package br.com.folhafacil.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayrollDTO {
	
	public Long employeeId;
	
	@JsonIgnore
	public String referringMonth;
	
	@JsonIgnore
	public Long referringYear;
	
	@JsonIgnore
	public String nameCompany;
	
	@JsonIgnore
	public Long cnpj;
	
	@JsonIgnore
	public BigDecimal liquidSalary;
	
	@JsonIgnore
	public String descripiton;
	
	@JsonIgnore
	public BigDecimal discounts;

}
