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

import com.agencia.goTour.model.Cliente;
import com.agencia.goTour.repositories.ClienteRepository;
import com.agencia.goTour.services.ClienteServices;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository cr;
	
	@Autowired
	private ClienteServices cs;

	@GetMapping
	public List<Cliente> Clientes() {
			
		return cr.findAll();
	}
	
	@PostMapping
	public Cliente cadastrarCliente(@RequestBody Cliente cliente) {		
		return cr.save(cliente);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Cliente> atualizarCliente(@PathVariable("id") Long id, @RequestBody Cliente clienteAtualizado) {
		Cliente clienteLocalizado = cs.buscarClienteporId(id);	
		
		clienteLocalizado.setNomeCliente(clienteLocalizado.getNomeCliente());
		clienteLocalizado.setCpf(clienteLocalizado.getCpf());
		clienteLocalizado.setEmail(clienteLocalizado.getEmail());
		clienteLocalizado.setEndereco(clienteLocalizado.getEndereco());
		clienteLocalizado.setTelefone(clienteLocalizado.getTelefone());
		
		cs.atualizarCliente(id, clienteAtualizado);
		
		return ResponseEntity.ok(clienteLocalizado);
	}
	
	@DeleteMapping("/{id}")
	public void deletarCliente(@PathVariable Long id) {
		cr.deleteById(id);		
	}
	
}
