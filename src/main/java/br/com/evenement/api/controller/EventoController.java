package br.com.evenement.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.evenement.api.model.Evento;
import br.com.evenement.api.service.EventoService;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventoController {
    @Autowired
    private EventoService eventoService;

    @GetMapping
    public List<Evento> getAllEvents() {
        return eventoService.getAllEvents();
    }

    @GetMapping("/{id}")
    public Evento getEventById(@PathVariable Long id) {
        return eventoService.getEventById(id);
    }

    @PostMapping
    public Evento createEvent(@RequestBody Evento evento) {
        return eventoService.createEvent(evento);
    }

    @PutMapping("/{id}")
    public Evento updateEvent(@PathVariable Long id, @RequestBody Evento eventDetails) {
        return eventoService.updateEvent(id, eventDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        eventoService.deleteEvent(id);
    }
}