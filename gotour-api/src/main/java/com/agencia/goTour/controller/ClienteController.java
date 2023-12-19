package com.agencia.goTour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agencia.goTour.model.Cliente;
import com.agencia.goTour.repositories.ClienteRepository;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository cr;

	@GetMapping
	public List<Cliente> Clientes() {
			
		return cr.findAll();
	}
	
	@PostMapping
	public Cliente cadastrarCliente(@RequestBody Cliente cliente) {		
		return cr.save(cliente);
	}
	
	@PutMapping("/{id}")
	public Cliente atualizarCliente(@PathVariable("id") Long id, @RequestBody Cliente clienteAtualizado) {
		Cliente localizarCliente = cr.findById(id);	
		localizarCliente.setNomeCliente(localizarCliente.getNomeCliente());
		localizarCliente.setCpf(localizarCliente.getCpf());
		localizarCliente.setEmail(localizarCliente.getEmail());
		localizarCliente.setEndereco(localizarCliente.getEndereco());
		localizarCliente.setTelefone(localizarCliente.getTelefone());
	}
	
	@DeleteMapping("/{id}")
	public void deletarCliente(@PathVariable Long id) {
		cr.deleteById(id);		
	}
	
}
