package com.gerenciamentoestoque.chegaRapidex.controller;

import com.gerenciamentoestoque.chegaRapidex.entities.Recipient;
import com.gerenciamentoestoque.chegaRapidex.service.RecipientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipient")
public class RecipientController
{
	@Autowired
	private RecipientService service;

	@GetMapping(path = {"/{id}"})
	public ResponseEntity<Recipient> findRecipientById(@PathVariable Long id){
		return service.findRecipientById(id);
	}

	@GetMapping
	public List<Recipient> findAllRecipients() {
		return service.findAllRecipients();
	}

	@DeleteMapping(path = {"/{id}"})
	public void deleteRecipientById(@PathVariable Long id) {
		service.deleteRecipientById(id);
	}

	@PutMapping(path = {"/{id}"})
	public ResponseEntity<Recipient> updateRecipient(@PathVariable Long id, Recipient recipient) {
		return service.updateRecipient(id, recipient);
	}

	@PostMapping
	public ResponseEntity<Recipient> createRecipient(Recipient recipient) {
		return service.createRecipient(recipient);
	}

	@DeleteMapping
	public ResponseEntity<Recipient> deleteAllRecipients() {
		return service.deleteAllRecipients();
	}
}