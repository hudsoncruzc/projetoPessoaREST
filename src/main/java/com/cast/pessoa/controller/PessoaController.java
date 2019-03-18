package com.cast.pessoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cast.pessoa.model.Pessoa;
import com.cast.pessoa.repository.PessoaRepository;

@Controller
@RequestMapping("/rest")
public class PessoaController {
	
	@Autowired
	private PessoaRepository crudPessoaDAO;
	
	@GetMapping("/pessoas")
	public ResponseEntity<?> listaPessoas(){
		return new ResponseEntity <> (crudPessoaDAO.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> savePessoa(@RequestBody Pessoa pessoa){
		return new ResponseEntity <> (crudPessoaDAO.save(pessoa), HttpStatus.OK);
 	}
	
	@DeleteMapping(path = "/remove/{idPessoa}")
	public ResponseEntity<?> removePessoa(@PathVariable long idPessoa){
		
		crudPessoaDAO.delete(crudPessoaDAO.findByIdPessoa(idPessoa));
		return new ResponseEntity <> (HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updatePessoa(@RequestBody Pessoa pessoa){
		return new ResponseEntity <> (crudPessoaDAO.save(pessoa), HttpStatus.OK);
		
	}
	
	@GetMapping(path = "/pessoa/{id}")
	public ResponseEntity<?> buscaPessoa(@PathVariable long id){
		return new ResponseEntity <> (crudPessoaDAO.findByIdPessoa(id), HttpStatus.OK);
	}
	
	

}
