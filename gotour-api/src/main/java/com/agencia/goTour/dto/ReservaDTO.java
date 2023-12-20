package com.agencia.goTour.dto;

import java.time.LocalDate;


public class ReservaDTO {

	private Long id;
	private String descricaoReserva;
	private LocalDate dataIda;
	private LocalDate dataVolta;		 
	private Double valor;	 
	private String tipoPagamento;
	
	private Long idCliente;
	private Long idDestino;
	    


    public ReservaDTO(Long id, String descricaoReserva) {
        this.id = id;
        this.descricaoReserva = descricaoReserva;
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricaoReserva() {
		return descricaoReserva;
	}
	public void setDescricaoReserva(String descricaoReserva) {
		this.descricaoReserva = descricaoReserva;
	}
	public LocalDate getDataIda() {
		return dataIda;
	}
	public void setDataIda(LocalDate dataIda) {
		this.dataIda = dataIda;
	}
	public LocalDate getDataVolta() {
		return dataVolta;
	}
	public void setDataVolta(LocalDate dataVolta) {
		this.dataVolta = dataVolta;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public Long getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(Long idDestino) {
		this.idDestino = idDestino;
	}	
	
}
