package br.com.folhafacil.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PayrollItemDTO {

	public String descripiton;
	
	public BigDecimal discount;
	
	public BigDecimal earnings;

	public BigDecimal reference;

	public BigDecimal getReference() {
		return reference;
	}

	public void setReference(BigDecimal reference) {
		this.reference = reference;
	}

	public String getDescripiton() {
		return descripiton;
	}

	public void setDescripiton(String descripiton) {
		this.descripiton = descripiton;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getEarnings() {
		return earnings;
	}

	public void setEarnings(BigDecimal earnings) {
		this.earnings = earnings;
	}

}
