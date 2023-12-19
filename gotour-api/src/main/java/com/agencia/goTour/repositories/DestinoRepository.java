package com.agencia.goTour.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencia.goTour.model.Destino;
import com.agencia.goTour.model.Reserva;




@Repository
public interface DestinoRepository extends JpaRepository <Destino, Long> {

	List<Reserva> findByReservaId(Long idReserva);
	
}
