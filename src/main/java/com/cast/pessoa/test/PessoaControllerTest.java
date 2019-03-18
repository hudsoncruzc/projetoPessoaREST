package com.cast.pessoa.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;

public class PessoaControllerTest {
	
	
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
