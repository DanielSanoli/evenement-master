package br.com.evenement.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.evenement.api.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}