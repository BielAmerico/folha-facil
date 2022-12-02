package br.com.folhafacil;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.folhafacil.model.SystemUserEntity;
import br.com.folhafacil.repository.SystemUserRepository;

@SpringBootApplication
public class FolhaFacilApplication {

	public static void main(String[] args) {
		SpringApplication.run(FolhaFacilApplication.class, args);
	}

	/*
	 * @Bean public CommandLineRunner loadSystemUser(SystemUserRepository
	 * repository) { return (args) -> {
	 * 
	 * SystemUserEntity user = new SystemUserEntity();
	 * 
	 * repository.save(user); } }
	 */
	
}
