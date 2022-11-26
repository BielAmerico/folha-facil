package br.com.folhafacil.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.folhafacil.model.PayrollEntity;

@Repository
public interface PayrollRepository extends CrudRepository<PayrollEntity ,Long>{
	
}
