package br.com.folhafacil.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.folhafacil.dto.SystemUserDTO;
import br.com.folhafacil.services.SystemUserService;

@RestController
@RequestMapping("/sys_user")
public class SystemUserController {

	@Autowired
	private SystemUserService systemUserService;

	@PostMapping("/login")
	public Boolean login(@RequestBody SystemUserDTO user){
		return this.systemUserService.makeLogin(user);
	}
}
