package com.agencia.goTour.servicesImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.agencia.goTour.dto.ReservaDTO;
import com.agencia.goTour.model.Cliente;
import com.agencia.goTour.model.Destino;
import com.agencia.goTour.model.Reserva;
import com.agencia.goTour.repositories.ClienteRepository;
import com.agencia.goTour.repositories.DestinoRepository;
import com.agencia.goTour.repositories.ReservaRepository;
import com.agencia.goTour.services.ReservaServices;

	@Service
	public class ReservaServiceImpl implements ReservaServices {

		@Autowired
		private ReservaRepository reservaRepository;
		
		@Autowired
		private ModelMapper mapper;
		
		@Autowired
		private ClienteRepository cRepo;

		@Autowired
		private DestinoRepository dRepo;

	
		
		@Override
		public List<Reserva> buscarReservas() {
			return reservaRepository.findAll();
		}

		@Override
		@Transactional(readOnly = true)
		public Reserva buscarReservaporId(Long id) {
			return reservaRepository.findById(id).orElse(null);
		}

		@Override
		public Reserva salvarReserva(ReservaDTO rDTO) {
			
			Reserva reserva = mapper.map(rDTO, Reserva.class);
			
			return reservaRepository.save(reserva);
		}

		@Override
		public Reserva atualizarReserva(Long id, ReservaDTO rDTOAtualizado) {
			Reserva reservaExistente = reservaRepository.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Not Found"));
			Cliente cliente = cRepo.findById(rDTOAtualizado.getIdCliente())
			        .orElseThrow(() -> new RuntimeException("Não há cliente registrado para o ID informado: " + rDTOAtualizado.getIdCliente()));

			Destino destino = dRepo.findById(rDTOAtualizado.getIdDestino())
			        .orElseThrow(() -> new RuntimeException("Não há destino registrado para o ID informado: " + rDTOAtualizado.getIdDestino()));
			
				reservaExistente.setDescricaoReserva(rDTOAtualizado.getDescricaoReserva());			
				reservaExistente.setDataIda(rDTOAtualizado.getDataIda());
				reservaExistente.setDataVolta(rDTOAtualizado.getDataVolta());
				reservaExistente.setValor(rDTOAtualizado.getValor());
				reservaExistente.setTipoPagamento(rDTOAtualizado.getTipoPagamento());
				reservaExistente.setCliente(cliente);
				reservaExistente.setDestino(destino);
				
				return reservaRepository.save(reservaExistente);
			
		}
				
		@Override
		public void deletarReserva(Long id) {
			reservaRepository.deleteById(id);
		}
	
}
	
