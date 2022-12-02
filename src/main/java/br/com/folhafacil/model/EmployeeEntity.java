package br.com.folhafacil.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
public class EmployeeEntity implements Serializable {

	private static final long serialVersionUID = -8271601598424373902L;
	
	public EmployeeEntity() {
		// constructor default
	}
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	public Long id;
	
	public String name;
	
	public Long cpf;
	
	public String rg;
		
	public String gender;
	
	public String email;
	
	public String telephone;
	
	public BigDecimal baseSalary;
	
	public String office;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee", orphanRemoval = true)
	public List<PayrollEntity> payrolls = new ArrayList<>();;

	
	public void addPayroll(PayrollEntity payroll) {
		this.payrolls.add(payroll);
		payroll.setEmployee(this);
	}
	
	public void removePayroll(PayrollEntity payroll) {
		this.payrolls.remove(payroll);
		payroll.setEmployee(null);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public BigDecimal getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(BigDecimal baseSalary) {
		this.baseSalary = baseSalary;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	@JsonManagedReference
	public List<PayrollEntity> getPayroll() {
		return payrolls;
	}

	public void setPayroll(List<PayrollEntity> payroll) {
		this.payrolls = payroll;
	}
}
