package com.guilherme.sisescola.model;

import jakarta.persistence.*;

// Entidade que representa um Aluno
@Entity
public class Student {

    // Identificador técnico do Aluno
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nome do Aluno
    private String name;

    // Turma à qual o Aluno pertence
    @ManyToOne
    @JoinColumn(name = "school_class_id")
    private SchoolClass schoolClass;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }
}
