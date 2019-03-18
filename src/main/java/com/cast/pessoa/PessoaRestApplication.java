package com.cast.pessoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * Classe principal do projeto Pessoa REST + Angular
 *
 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
 * @version $Revision: 1.1 $
 */

@SpringBootApplication
public class PessoaRestApplication {

	/**
	 * 
	 * Ponto de início da aplicacao.
	 *
	 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
	 * @param Valor dos parametros são vazios 
	 * void
	 */
	public static void main(String[] args) {
		SpringApplication.run(PessoaRestApplication.class, args);
	}

}
