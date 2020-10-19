package com.qa.crud.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.qa.crud.persistance.domain.Crud;
import com.qa.crud.service.CrudService;

@RestController
@CrossOrigin
public class CrudController {
	
	private CrudService service;

	public CrudController(CrudService service) {
		super();
		this.service = service;
	}

	@GetMapping("/getCrud")
	public ResponseEntity<List<Crud>> getCrud() {
		return ResponseEntity.ok(this.service.getCrud());
	}
	
	@PutMapping("/updateCrud")
	public ResponseEntity<Crud> updateCrud(@RequestBody Crud crud, @PathParam("id") long id) {
		return new ResponseEntity<Crud>(this.service.updateCrud(crud, id), HttpStatus.ACCEPTED);
	}

	@PostMapping("/createCrud")
	public ResponseEntity<Crud> updateCrud(@RequestBody Crud crud) {
		return new ResponseEntity<Crud>(this.service.createCrud(crud), HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteCrud(@PathVariable int id) {
		if (this.service.deleteCrud(id)) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
