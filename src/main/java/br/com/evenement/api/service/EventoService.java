package br.com.evenement.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.evenement.api.model.Evento;
import br.com.evenement.api.repository.EventoRepository;

@Service
public class EventoService {
    
    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> getAllEvents() {
        return eventoRepository.findAll();
    }

    public Evento getEventById(Long id) {
        return eventoRepository.findById(id).orElse(null);
    }

    public Evento createEvent(Evento event) {
        return eventoRepository.save(event);
    }

    public Evento updateEvent(Long id, Evento eventDetails) {
        Evento evento = eventoRepository.findById(id).orElse(null);
        if (evento != null) {
            evento.setTitulo(eventDetails.getTitulo());
            evento.setDescricao(eventDetails.getDescricao());
            evento.setHorarioInicio(eventDetails.getHorarioInicio());
            evento.setHorarioFim(eventDetails.getHorarioFim());
            return eventoRepository.save(evento);
        }
        return null;
    }

    public void deleteEvent(Long id) {
        eventoRepository.deleteById(id);
    }
}