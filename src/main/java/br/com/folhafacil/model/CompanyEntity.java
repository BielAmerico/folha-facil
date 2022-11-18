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
@Table(name = "company")
public class CompanyEntity implements Serializable {

	private static final long serialVersionUID = -8271601598424373902L;

	public CompanyEntity() {
		// Constructor
	}
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;

	private String corporateName;

	private String fantasyName;

	private String cnpj;

	private String zipCode;

	private String road;

	private Integer numAddress;

	private String complement;
}
