package com.cast.pessoa.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;



/**
 * 
 * Classe PessoaControllerTest: Realiza teste de unidade
 *
 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
 * @version $Revision: 1.1 $
 */


public class PessoaControllerTest {
	
	/**
	 * 
	 * Realiza teste no servico rest/pessoas.
	 *
	 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
	 * @param Parametro vazio
	 * @return True or false.
	 * void
	 */
	@Test
	public void testlistaPessoas() throws IOException {
		
		int HTTP_SUCESSO = 200;
		
		try {
			
			URL url = new URL("http://localhost:8080/rest/pessoas");
			
			HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
			
			Assert.assertEquals(HTTP_SUCESSO, conexao.getResponseCode());
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	/**
	 * 
	 * Realiza teste no servico rest/pessoas/{1}.
	 *
	 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
	 * @param id
	 * @return True or false.
	 * void
	 */
	@Test
	public void testbuscaPessoa() throws IOException {
		
		int HTTP_SUCESSO = 200;
		
		try {
			
			URL url = new URL("http://localhost:8080/rest/pessoa/1");
			
			HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
			
			Assert.assertEquals(HTTP_SUCESSO, conexao.getResponseCode());
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
