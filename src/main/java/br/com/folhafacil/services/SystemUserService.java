package br.com.folhafacil.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.folhafacil.dto.SystemUserDTO;
import br.com.folhafacil.model.SystemUserEntity;
import br.com.folhafacil.repository.SystemUserRepository;

@Service
public class SystemUserService {
	
	@Autowired
	private SystemUserRepository systemUserRepository;

	public boolean makeLogin(SystemUserDTO userDto) {
		
		SystemUserEntity savedUser = this.systemUserRepository.findByLogin(userDto.login);
		
		String receivedPassword = userDto.password;
		String currentPassword = savedUser.password;	
		
		if (receivedPassword.equals(currentPassword)) {
			System.out.println("Login efetuado com sucesso!");
			return true;
		} 
		else { 
			System.out.println("Erro no login");
			return false;
		}
	}
}

