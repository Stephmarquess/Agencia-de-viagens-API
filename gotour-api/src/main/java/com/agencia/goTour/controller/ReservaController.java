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

import com.agencia.goTour.model.Reserva;
import com.agencia.goTour.repositories.ReservaRepository;


@RestController
@RequestMapping("/reserva")
public class ReservaController {
	
	@Autowired
	private ReservaRepository rRepo;

	@GetMapping
	public List<Reserva> Reservas() {
			
		return rRepo.findAll();
	}
	
	@PostMapping
	public Reserva cadastrarReserva(@RequestBody Reserva reserva) {
		
		return rRepo.save(reserva);
	}
	
	@DeleteMapping("/{id}")
	public void deletarReserva(@PathVariable Long id) {
		rRepo.deleteById(id);		
	}
	
	}
