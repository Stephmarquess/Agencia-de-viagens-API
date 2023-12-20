package com.agencia.goTour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agencia.goTour.model.Destino;
import com.agencia.goTour.services.DestinoServices;


@RestController
@RequestMapping("/destino")

public class DestinoController {
	
	@Autowired
	private DestinoServices ds;

	@GetMapping
	public List<Destino> destinos() {
			
		return ds.buscarDestinos();
	}
	
	@PostMapping
	public Destino cadastrardestino(@RequestBody Destino destino) {		
		return ds.salvarDestino(destino);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Destino> atualizarDestino(@PathVariable("id") Long id, @RequestBody Destino destinoAtualizado) {
		Destino DestinoLocalizado = ds.buscarDestinoporId(id);	
		
		DestinoLocalizado.setNomeDestino(DestinoLocalizado.getNomeDestino());
		DestinoLocalizado.setDescricaoDestino(DestinoLocalizado.getDescricaoDestino());
		
		ds.atualizarDestino(id, destinoAtualizado);
		
		return ResponseEntity.ok(DestinoLocalizado);
	}
	
	@DeleteMapping("/{id}")
	public void deletarDestino(@PathVariable Long id) {
		ds.deletarDestino(id);		
	}
	
}
