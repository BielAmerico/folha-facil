package br.com.folhafacil.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.folhafacil.model.BenefitEntity;

@Repository
public interface BenefitRepository extends CrudRepository <BenefitEntity ,Long> {

}
