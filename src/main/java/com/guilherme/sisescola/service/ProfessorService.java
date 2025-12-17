package com.guilherme.sisescola.service;

import com.guilherme.sisescola.model.Professor;
import com.guilherme.sisescola.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public Professor salvar(Professor professor) {
        return repository.save(professor);
    }

    public List<Professor> listar() {
        return repository.findAll();
    }
}
