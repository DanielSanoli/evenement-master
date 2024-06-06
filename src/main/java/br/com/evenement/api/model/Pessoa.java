package br.com.evenement.api.model;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
public class Pessoa {
    
    @NotBlank
    @Column(name = "de_nome")
    private String nome;

    @NotBlank
    @Column(name = "de_email")
    private String email;

    @NotBlank
    @Column(name = "de_senha")
    private String senha;

    @NotBlank
    @Column(name = "nu_telefone")
    private String telefone;

    @NotBlank
    @Column(name = "nu_cpf")
    private String cpf;

    public Pessoa(String nome, String email, String senha, String telefone, String cpf) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
