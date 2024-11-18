package com.IRCTC_ResourceApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.IRCTC_ResourceApp.request.Passanger;
import com.IRCTC_ResourceApp.responce.Ticket;
import com.IRCTC_ResourceApp.service.ServiceI;

@RestController
public class PassangerController {

	@Autowired
	private ServiceI serviceI;
	
	@PostMapping(value="/bookTicket",produces = "application/json",consumes = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger psg) {		
		Ticket bookTicket = serviceI.bookTicket(psg);
		return new ResponseEntity<Ticket>(bookTicket,HttpStatus.CREATED);
		
	}
}
