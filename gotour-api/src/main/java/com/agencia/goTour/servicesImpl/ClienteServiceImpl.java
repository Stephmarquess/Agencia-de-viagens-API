package com.agencia.goTour.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agencia.goTour.model.Cliente;
import com.agencia.goTour.repositories.ClienteRepository;
import com.agencia.goTour.services.ClienteServices;


@Service
public class ClienteServiceImpl implements ClienteServices {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> buscarClientes() {
		return clienteRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente buscarClienteporId(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente salvarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente atualizarCliente(Long id, Cliente clienteAtualizado) {
		Cliente clienteExistente = clienteRepository.findById(id).orElse(null);
		if (clienteExistente != null) {
			clienteExistente.setNomeCliente(clienteAtualizado.getNomeCliente());
			clienteExistente.setEmail(clienteAtualizado.getEmail());
			clienteExistente.setCpf(clienteAtualizado.getCpf());
			clienteExistente.setEndereco(clienteAtualizado.getEndereco());
			clienteExistente.setTelefone(clienteAtualizado.getTelefone());
			return clienteRepository.save(clienteExistente);
		} else {
			throw new RuntimeException("Usuario com o ID " + id + "não encontrado.");
		}
	}

	@Override
	public void deletarCliente(Long id) {
		clienteRepository.deleteById(id);
	}

	
	
}
