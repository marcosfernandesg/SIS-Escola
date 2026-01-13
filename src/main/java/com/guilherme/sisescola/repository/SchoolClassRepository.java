package com.guilherme.sisescola.repository;

import com.guilherme.sisescola.model.SchoolClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolClassRepository extends JpaRepository<SchoolClass, Long> {
}
