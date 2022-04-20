package br.com.livros.controllers;

import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.livros.models.Nationality;
import br.com.livros.services.implementation.NationalityServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
@RequestMapping("/nationality")
public class NationalityController {
	
	private static Logger log = LogManager.getLogger(NationalityController.class);
	
	@Autowired
	NationalityServiceImpl nationalityService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@Operation(summary = "Gets All Nationalities Available")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "All Nationalities Found "), 
			@ApiResponse(responseCode = "400", description = "Invalid Info Supplied" ), 
			@ApiResponse(responseCode = "404", description = "Nationalities Not Found" )}) 
	@RequestMapping(value = "/find", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Nationality>> findAll() {	
		    log.info(" Consultando Nacionalidades");		
			List<Nationality> nationalities = nationalityService.findAll();
			return new ResponseEntity(nationalities, HttpStatus.OK);
		}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@Operation(summary = "Saves All Nationalities Available")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "All Nationalities Saved "), 
			@ApiResponse(responseCode = "400", description = "Invalid Info Supplied" ), 
			@ApiResponse(responseCode = "404", description = "Nationalities Not Found" )}) 
	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Nationality> save(@RequestBody @Valid Nationality nationality){		
		   nationalityService.save(nationality); 
		return new ResponseEntity("Nationality Saved Sucessfully", HttpStatus.OK);
		
	}
	
	
}
