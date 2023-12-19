package com.agencia.goTour.services;

import java.util.List;

import com.agencia.goTour.model.Cliente;




public interface ClienteServices {

	List<Cliente> buscarClientes();	
	
	Cliente buscarClienteporId(Long id);
	
	Cliente salvarCliente(Cliente cliente);
	
	Cliente atualizarCliente(Long id, Cliente clienteAtualizado);
	
	void deletarCliente(Long id);

	
	
}
