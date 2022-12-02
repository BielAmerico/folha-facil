package br.com.folhafacil.model;


import java.io.Serializable;

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
@Table(name = "sys_user")
public class SystemUserEntity implements Serializable {
	
	private static final long serialVersionUID = -8271601598424373902L;

	public SystemUserEntity() {
		// Constructor
	}
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	public Long id;
	
	public String Active;
	
	public String name;
	
	public String login;
	
	public String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActive() {
		return Active;
	}

	public void setActive(String active) {
		Active = active;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}