package br.com.evenement.api.model;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_evento")
public class Evento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    @Column(name = "de_titulo")
    private String titulo;

    @NotBlank
    @Column(name = "de_descricao")
    private String descricao;

    @NotBlank
    @Column(name = "dt_inicio")
    private LocalDateTime horarioInicio;

    @NotBlank
    @Column(name = "dt_fim")
    private LocalDateTime horarioFim;

    @Column(name = "de_local")
    private String local;

    @Column(name = "de_organizador")
    private String organizador;

    @Column(name = "is_lembrete")
    private Boolean lembrete;

    public Evento(Long id, String titulo, String descricao, LocalDateTime horarioInicio, LocalDateTime horarioFim,
    String local, String organizador, Boolean lembrete) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.local = local;
        this.organizador = organizador;
        this.lembrete = lembrete;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getHorarioInicio() {
        return this.horarioInicio;
    }

    public void setHorarioInicio(LocalDateTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public LocalDateTime getHorarioFim() {
        return this.horarioFim;
    }

    public void setHorarioFim(LocalDateTime horarioFim) {
        this.horarioFim = horarioFim;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getOrganizador() {
        return this.organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public Boolean isLembrete() {
        return this.lembrete;
    }

    public Boolean getLembrete() {
        return this.lembrete;
    }

    public void setLembrete(Boolean lembrete) {
        this.lembrete = lembrete;
    }

}

