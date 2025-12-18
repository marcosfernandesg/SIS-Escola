package com.guilherme.sisescola.service;

import com.guilherme.sisescola.model.Turma;
import com.guilherme.sisescola.repository.TurmaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurmaService {

    private final TurmaRepository repository;

    public TurmaService(TurmaRepository repository) {
        this.repository = repository;
    }

    public Turma salvar(Turma turma) {
        return repository.save(turma);
    }

    public List<Turma> listar() {
        return repository.findAll();
    }

    public Turma buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Turma não encontrada"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
