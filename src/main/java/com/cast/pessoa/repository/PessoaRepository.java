package com.cast.pessoa.repository;

import org.springframework.data.repository.CrudRepository;

import com.cast.pessoa.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, String>{

	void deleteByIdPessoa(long idPessoa);

	Pessoa findByIdPessoa(long idPessoa);

	//void delete(long idPessoa);

}
