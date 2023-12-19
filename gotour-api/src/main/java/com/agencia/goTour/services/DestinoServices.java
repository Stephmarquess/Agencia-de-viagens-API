package com.agencia.goTour.services;

import java.util.List;

import com.agencia.goTour.model.Destino;


public interface DestinoServices {

	List<Destino> buscarDestinos();
	
	Destino buscarDestinoporId(Long id);
	
	Destino salvarDestino(Destino destino);
	
	Destino atualizarDestino(Long id, Destino destinoAtualizado);
	
	void deletarDestino(Long id);
	
}
