package com.agencia.goTour.services;

import java.util.List;

import com.agencia.goTour.dto.ReservaDTO;
import com.agencia.goTour.model.Reserva;


public interface ReservaServices {

	List<Reserva> buscarReservas();
	
	Reserva buscarReservaporId(Long id);
	
	Reserva salvarReserva(ReservaDTO rDTO);
	
	Reserva atualizarReserva(Long idReserva, ReservaDTO rDTOAtualizado);
	
	void deletarReserva(Long id);

	
}
