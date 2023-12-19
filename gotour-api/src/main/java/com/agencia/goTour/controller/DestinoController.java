package com.agencia.goTour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agencia.goTour.model.Destino;
import com.agencia.goTour.repositories.DestinoRepository;


@RestController
@RequestMapping("/destino")

public class DestinoController {
	
	@Autowired
	private DestinoRepository dr;

	@GetMapping
	public List<Destino> destinos() {
			
		return dr.findAll();
	}
	
	@PostMapping
	public Destino cadastrardestino(@RequestBody Destino destino) {		
		return dr.save(destino);
	}
	
	@DeleteMapping("/{id}")
	public void deletarDestino(@PathVariable Long id) {
		dr.deleteById(id);		
	}
	
}
