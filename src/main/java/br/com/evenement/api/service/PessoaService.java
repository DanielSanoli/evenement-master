package br.com.evenement.api.service;

import br.com.evenement.api.model.Pessoa;
import br.com.evenement.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<Pessoa> getPessoas() {
        return pessoaRepository.findAll();
    }

    public Pessoa getPessoa(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }

    public Pessoa savePessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public void deletePessoa(Long id) {
        pessoaRepository.deleteById(id);
    }

    public Pessoa updatePessoa(Long id, Pessoa pessoa) {
        Pessoa pessoaAtual = pessoaRepository.findById(id).orElse(null);
        if (pessoaAtual != null) {
            pessoaAtual.setNome(pessoa.getNome());
            pessoaAtual.setEmail(pessoa.getEmail());
            pessoaAtual.setTelefone(pessoa.getTelefone());
            return pessoaRepository.save(pessoaAtual);
        }
        return null;
    }
}