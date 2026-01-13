package com.guilherme.sisescola.repository;

import com.guilherme.sisescola.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface StudentRepository extends JpaRepository<Student, Long> {
}
