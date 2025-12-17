package com.guilherme.sisescola.repository;

import com.guilherme.sisescola.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
