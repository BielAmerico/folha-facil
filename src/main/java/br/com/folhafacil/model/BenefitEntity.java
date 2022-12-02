package br.com.folhafacil.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "benefit")
public class BenefitEntity implements Serializable {
	
	private static final long serialVersionUID = -8271601598424373902L;
	
	public BenefitEntity() {
		//constructor default
	}
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	public Long id;
		
	@Column(name = "name", unique = true)
	public String nameBenefit;
	
	@Column(name = "applyPorcentagen")
	public Long porcentageBaseSalary;
	
	public BigDecimal value;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameBenefit() {
		return nameBenefit;
	}

	public void setNameBenefit(String nameBenefit) {
		this.nameBenefit = nameBenefit;
	}

	public Long getPorcentageBaseSalary() {
		return porcentageBaseSalary;
	}

	public void setPorcentageBaseSalary(Long porcentageBaseSalary) {
		this.porcentageBaseSalary = porcentageBaseSalary;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}
}
