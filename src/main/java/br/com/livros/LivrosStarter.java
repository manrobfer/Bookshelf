package br.com.livros;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Profile;


@SpringBootApplication
public class LivrosStarter extends SpringBootServletInitializer {
	
	public static void main(String[] args) {
		
        SpringApplication.run(LivrosStarter.class, args);
        
	}
}