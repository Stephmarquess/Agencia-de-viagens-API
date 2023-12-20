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

import com.agencia.goTour.dto.ReservaDTO;
import com.agencia.goTour.model.Reserva;

import com.agencia.goTour.services.ReservaServices;


@RestController
@RequestMapping("/reserva")
public class ReservaController {
	
	
	@Autowired
	private ReservaServices rServ;
	
		
	@GetMapping
	public List<Reserva> Reservas() {
			
		return rServ.buscarReservas();
	}
	
	@PostMapping
	public Reserva cadastrarReserva(@RequestBody ReservaDTO rDTO) {
		
		return rServ.salvarReserva(rDTO);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Reserva> atualizaraReserva(@PathVariable Long id, @RequestBody ReservaDTO rDTOatualizado) {
		
		Reserva reserva = rServ.buscarReservaporId(id);		
		rServ.atualizarReserva(id, rDTOatualizado);
		
		return ResponseEntity.ok(reserva);
	}
	
	
	@DeleteMapping("/{id}")
	public void deletarReserva(@PathVariable Long id) {
		rServ.deletarReserva(id);	
	}
	
	}
