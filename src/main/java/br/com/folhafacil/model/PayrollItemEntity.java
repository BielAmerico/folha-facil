package br.com.folhafacil.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payroll_item")
public class PayrollItemEntity implements Serializable {

	private static final long serialVersionUID = -8254857528667542266L;

	public PayrollItemEntity() {
		// constructor default
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String descripiton;
	
	public BigDecimal discount;
	
	public BigDecimal earnings;
	
	public BigDecimal reference;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "payroll_id")
	public PayrollEntity payroll;
	
	
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

	@JsonBackReference
	public PayrollEntity getPayroll() {
		return payroll;
	}

	public void setPayroll(PayrollEntity payroll) {
		this.payroll = payroll;
	}
}
