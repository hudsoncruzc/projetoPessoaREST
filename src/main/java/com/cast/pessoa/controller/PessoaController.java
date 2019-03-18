package com.cast.pessoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cast.pessoa.model.Pessoa;
import com.cast.pessoa.repository.PessoaRepository;
/**
 * 
 * Classe Rest controller: mapeia os endpoints e traz os resultados
 *
 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
 * @version $Revision: 1.1 $
 */

@RestController
@RequestMapping("/rest")
public class PessoaController {
	
	@Autowired
	private PessoaRepository crudPessoaDAO;
	
	
	/**
	 * 
	 * Retorna a lista de pessoas cadastradas.
	 *
	 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
	 * @param Parametro vazio
	 * @return Lista de pessoas cadastradas.
	 * ResponseEntity
	 */
	@GetMapping("/pessoas")
	public ResponseEntity<?> listaPessoas(){
		return new ResponseEntity <> (crudPessoaDAO.findAll(), HttpStatus.OK);
	}

	/**
	 * 
	 * POST: Inclui os dados atraves do objeto passado de parametro
	 *
	 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
	 * @param Objeto pessoa. 
	 * @return Http status.
	 * ResponseEntity
	 */
	@PostMapping("/save")
	public ResponseEntity<?> savePessoa(@RequestBody Pessoa pessoa){
		return new ResponseEntity <> (crudPessoaDAO.save(pessoa), HttpStatus.OK);
 	}

	
	/**
	 * 
	 * DELETE: Exclusão do registro atraves do parametro Id
	 *
	 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
	 * @param id (unique). 
	 * @return Http status.
	 * ResponseEntity
	 */
	@DeleteMapping(path = "/remove/{idPessoa}")
	public ResponseEntity<?> removePessoa(@PathVariable long idPessoa){
		
		crudPessoaDAO.delete(crudPessoaDAO.findByIdPessoa(idPessoa));
		return new ResponseEntity <> (HttpStatus.OK);
	}
	
	
	/**
	 * 
	 * PUT: Atualiza os dados atraves do objeto passado de parametro
	 *
	 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
	 * @param Objeto pessoa. 
	 * @return Http status.
	 * ResponseEntity
	 */
	@PutMapping("/update")
	public ResponseEntity<?> updatePessoa(@RequestBody Pessoa pessoa){
		return new ResponseEntity <> (crudPessoaDAO.save(pessoa), HttpStatus.OK);
		
	}

	/**
	 * 
	 * GET: Retorna dos dados de uma pessoa referente ao Id passado no parametro.
	 *
	 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
	 * @param id (unique). 
	 * @return Dados da pessoa com o id referente
	 * ResponseEntity
	 */
	@GetMapping(path = "/pessoa/{id}")
	public ResponseEntity<?> buscaPessoa(@PathVariable long id){
		return new ResponseEntity <> (crudPessoaDAO.findByIdPessoa(id), HttpStatus.OK);
	}
	
	

}
