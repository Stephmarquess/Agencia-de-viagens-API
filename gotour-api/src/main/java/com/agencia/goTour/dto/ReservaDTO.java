package com.agencia.goTour.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ReservaDTO {

	private Long id;
	private String descricaoReserva;
	private LocalDate dataIda;
	private LocalDate dataVolta;		 
	private Double valor;	 
	private String tipoPagamento;
	
	@JsonProperty("clientDTO")
    private ClienteDTO cliDTO;

    @JsonProperty("destinationDTO")
    private DestinoDTO desDTO;
    
	
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
	public ClienteDTO getCliDTO() {
		return cliDTO;
	}
	public void setCliDTO(ClienteDTO cliDTO) {
		this.cliDTO = cliDTO;
	}
	public DestinoDTO getDesDTO() {
		return desDTO;
	}
	public void setDesDTO(DestinoDTO desDTO) {
		this.desDTO = desDTO;
	}
	
	
	
}
