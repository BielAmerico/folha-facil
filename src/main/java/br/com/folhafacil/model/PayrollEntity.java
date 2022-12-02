package br.com.folhafacil.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
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
@AllArgsConstructor
@NoArgsConstructor
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
		public Integer referringYear;
		
		public String nameCompany;
		
		public Long cnpj;
		
		public BigDecimal liquidSalary;
		
		public String descripiton;
		
		public BigDecimal discounts;
		
		public BigDecimal baseSalary;

		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "employee_id")
		public EmployeeEntity employee;

		public Long getId() {
			return id;
		}

		public BigDecimal getBaseSalary() {
			return baseSalary;
		}

		public void setBaseSalary(BigDecimal baseSalary) {
			this.baseSalary = baseSalary;
		}

		public String getReferringMonth() {
			return referringMonth;
		}

		public void setReferringMonth(String referringMonth) {
			this.referringMonth = referringMonth;
		}

		public Integer getReferringYear() {
			return referringYear;
		}

		public void setReferringYear(Integer referringYear) {
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

		@JsonBackReference
		public EmployeeEntity getEmployee() {
			return employee;
		}

		public void setEmployee(EmployeeEntity employee) {
			this.employee = employee;
		}
		
		@Override
		public int hashCode() {
			return getClass().hashCode();
		}
}

