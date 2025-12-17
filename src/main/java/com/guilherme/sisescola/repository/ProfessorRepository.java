package com.guilherme.sisescola.repository;

import com.guilherme.sisescola.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
