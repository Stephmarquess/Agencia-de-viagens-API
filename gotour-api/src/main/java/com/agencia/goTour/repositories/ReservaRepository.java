package com.agencia.goTour.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.agencia.goTour.model.Reserva;




@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {

	List<Reserva> findByClienteId(Long idCliente);

	List<Reserva> findByDestinoId(Long idReserva);

	
	
}
