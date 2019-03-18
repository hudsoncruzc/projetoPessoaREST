package com.cast.pessoa.repository;

import org.springframework.data.repository.CrudRepository;

import com.cast.pessoa.model.Pessoa;

/**
 * 
 * Repository Pessoa
 *
 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
 */


public interface PessoaRepository extends CrudRepository<Pessoa, String>{

	/**
	 * 
	 * Metodo busca os dados de Pessoa conforme Id de parametro.
	 *
	 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
	 * @param id
	 * @return
	 * Pessoa
	 */
	Pessoa findByIdPessoa(long idPessoa);

	/**
	 * 
	 * Metodo deleta os dados de Pessoa conforme Id de parametro.
	 *
	 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
	 * @param id
	 * @return
	 * void
	 */	
	void deleteByIdPessoa(long idPessoa);
	

}
