package br.com.livros;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LivrosStarter {	
	
	public static void main(String[] args) {
		
        SpringApplication.run(LivrosStarter.class, args);	
        
	}
}