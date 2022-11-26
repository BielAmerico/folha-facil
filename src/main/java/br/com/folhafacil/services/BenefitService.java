package br.com.folhafacil.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.folhafacil.model.BenefitEntity;
import br.com.folhafacil.repository.BenefitRepository;

@Service
public class BenefitService {

	@Autowired
	private BenefitRepository benefitRepository;

	public List<BenefitEntity> findAll() {
		return (List<BenefitEntity>) this.benefitRepository.findAll();
	}
}
