package com.algarworks.curso;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LendoArquivosProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("./config/config.properties"));

		String url = prop.getProperty("banco.dados.url");
		String usuario = prop.getProperty("banco.dados.usuario");
		String senha = prop.getProperty("banco.dados.senha");
		
		System.out.printf("Conectado ao banco de dados de url: $s e usuario: %s /n", url, usuario);
	
		try {
			int x = 5 / 0;
		} catch (Exception e) { // Se acontecer algum erro deve informar o administrador!
			String email = prop.getProperty("email.adm");
			System.err.printf("Email enviado ao adminsitrador: %s informando o erro: %s/n", email, e.getMessage());
		}
	
	}

}
