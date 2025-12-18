package com.guilherme.sisescola.service;

import com.guilherme.sisescola.model.Aluno;
import com.guilherme.sisescola.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }

    public List<Aluno> listar() {
        return repository.findAll();
    }

    public Aluno buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    public Aluno atualizar(Long id, Aluno aluno) {
        Aluno existente = buscarPorId(id);
        existente.setNome(aluno.getNome());
        existente.setEmail(aluno.getEmail());
        existente.setMatricula(aluno.getMatricula());
        return repository.save(existente);
    }


    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
