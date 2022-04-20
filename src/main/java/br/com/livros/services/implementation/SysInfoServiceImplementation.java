package br.com.livros.services.implementation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.com.livros.services.SysInfoService;

@Service
public class SysInfoServiceImplementation implements SysInfoService{
	
	@Value("${application-description}") 
	String title;
	
	@Value("${application-version}") 
	String version;

	@Override
	public String getVersion() {	
		if ( version != null || !version.isBlank()) {
		  return this.version;
		}
		return "Versao";
	}

	@Override
	public String getTitle() {	
		if (this.title != null || !this.title.isBlank()) {
			return this.title;
		}
		
		return "Titulos";
	}

}
