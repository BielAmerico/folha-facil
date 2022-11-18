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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
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
	private Long id;
		
	@Column(name = "name", unique = true)
	private String nameBenefit;
	
	@Column(name = "applyPorcentagen")
	private Long porcentageBaseSalary;
	
	private BigDecimal value;
}
