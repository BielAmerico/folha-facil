package br.com.folhafacil.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.folhafacil.model.SystemUserEntity;

public interface SystemUserRepository extends CrudRepository<SystemUserEntity, Long> {

	SystemUserEntity findByLogin(String login);
}
