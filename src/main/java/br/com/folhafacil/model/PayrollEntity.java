package br.com.folhafacil.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
@Table(name = "payroll")
public class PayrollEntity implements Serializable {

	private static final long serialVersionUID = -8271601598424373902L;
	
	public PayrollEntity() {
		//constructor default
	}
		@Id
		@GeneratedValue(	strategy = GenerationType.IDENTITY)
		public Long id;
		
		@Column(name = "month")
		public String referringMonth;
		
		@Column(name = "year")
		public Long referringYear;
		
		public String nameCompany;
		
		public Long cnpj;
		
		public BigDecimal liquidSalary;
		
		public String descripiton;
		
		public BigDecimal discounts;
		
		@ManyToOne
		@JoinColumn(name = "employee_id")
		public EmployeeEntity employee;
		
}

