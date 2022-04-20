package br.com.livros.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.livros.services.implementation.SysInfoServiceImplementation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/sysinfo")
public class SysInfoController {
	
	@Autowired
	SysInfoServiceImplementation sysinfo;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@Operation(summary = "Get System Info ")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Info Saved Successfuly "), 
			@ApiResponse(responseCode = "400", description = "Invalid Path" ), 
			@ApiResponse(responseCode = "404", description = "Info Not Saved" )}) 
	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )	
	public ResponseEntity<Object> get() {	
		
		Map<String, Object> info = new HashMap();
	    info.put("Sysname",sysinfo.getTitle());
		info.put("versao",sysinfo.getVersion());		
	
        return new ResponseEntity<Object>(info, HttpStatus.OK);
	}
}
