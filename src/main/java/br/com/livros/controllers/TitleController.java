package br.com.livros.controllers;

import java.util.List;

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

import br.com.livros.models.Title;
import br.com.livros.services.implementation.TitleServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/title")
public class TitleController {
	
private static Logger log = LogManager.getLogger(AuthorController.class);
	
	@Autowired
	TitleServiceImpl titleService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@Operation(summary = "Saves Books Title ")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Title Saved Successfuly "), 
			@ApiResponse(responseCode = "400", description = "Invalid Path" ), 
			@ApiResponse(responseCode = "404", description = "Title Not Saved" )}) 
	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )	
	public ResponseEntity<Title> create(@RequestBody Title title) {
		this.titleService.save(title);
	return new ResponseEntity("Title Saved Sucessfully",HttpStatus.OK);
		
}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@Operation(summary = "Saves Books Title ")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Title Saved Successfuly "), 
			@ApiResponse(responseCode = "400", description = "Invalid Path" ), 
			@ApiResponse(responseCode = "404", description = "Title Not Saved" )}) 
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )	
	public List<Title> readAll(){
		List<Title> titles = (List<Title>) titleService.findAll();
		return titles;
	}

}
