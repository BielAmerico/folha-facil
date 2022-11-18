package br.com.folhafacil.model;

import java.io.Serializable;

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
@Table(name = "employee")
public class EmployeeEntity implements Serializable {

	private static final long serialVersionUID = -8271601598424373902L;
	
	public EmployeeEntity() {
		// constructor default
	}
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	private String name;
	
	private Long cpf;
	
	private String rg;
		
	private String gender;
	
	private String email;
	
	private String telephone;
}
