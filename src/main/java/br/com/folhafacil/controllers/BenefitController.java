package br.com.folhafacil.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.folhafacil.model.BenefitEntity;
import br.com.folhafacil.services.BenefitService;

@RestController
@RequestMapping("/benefit")
public class BenefitController {

	@Autowired
	private BenefitService benefitService;

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<BenefitEntity> findAll() {
		return this.benefitService.findAll();
	}
}
