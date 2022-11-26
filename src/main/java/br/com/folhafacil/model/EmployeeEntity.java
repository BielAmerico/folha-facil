package br.com.folhafacil.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	public Long baseSalary;
	
	public String office;
	
	@OneToMany(mappedBy = "employee")
	public List<PayrollEntity> prayolls;
	
}
