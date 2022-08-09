package br.ufc.mandacaru5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufc.mandacaru5.model.Property;
import br.ufc.mandacaru5.service.PropertyService;

@RestController
@RequestMapping(path = "/api")
public class PropertyController {

	@Autowired
	PropertyService service;

	@GetMapping("/products/{id}/feedbacks")
	public ResponseEntity<List<Property>> findAll(@PathVariable(value = "id") int id) {
		return new ResponseEntity<List<Property>>(service.findAll(id), HttpStatus.OK);
	}

	@GetMapping("/feedbacks/{id}")
	public ResponseEntity<Property> find(@PathVariable("id") int id) {
		return new ResponseEntity<Property>(service.find(id), HttpStatus.OK);
	}

	@PostMapping("/products/{id}/feedbacks")
	public void save(@PathVariable("id") int product_id, @RequestBody Property property) {
		service.save(product_id, property);
	}

	@PutMapping("/feedbacks/{id}")
	public void update(@PathVariable("id") int id, @RequestBody Property property) {
		service.update(id, property);
	}

	@DeleteMapping("/feedbacks/{id}")
	public void delete(@PathVariable("id") int id) {
		service.delete(id);
	}
}
