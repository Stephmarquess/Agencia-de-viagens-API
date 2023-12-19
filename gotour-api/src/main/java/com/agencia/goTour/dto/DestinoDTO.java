package com.agencia.goTour.dto;

import java.util.List;

import com.agencia.goTour.model.Reserva;


public class DestinoDTO {

	
	private Long id;
	private String nomeDestino;
	private String descricaoDestino;	
    private List<Reserva> reserva;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeDestino() {
		return nomeDestino;
	}
	public void setNomeDestino(String nomeDestino) {
		this.nomeDestino = nomeDestino;
	}
	public String getDescricaoDestino() {
		return descricaoDestino;
	}
	public void setDescricaoDestino(String descricaoDestino) {
		this.descricaoDestino = descricaoDestino;
	}
	public List<Reserva> getReserva() {
		return reserva;
	}
	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}
	
	
}
