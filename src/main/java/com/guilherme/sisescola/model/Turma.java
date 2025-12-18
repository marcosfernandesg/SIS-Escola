package com.guilherme.sisescola.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String anoLetivo;

    @ManyToOne
    private Professor professor;

    @ManyToMany
    private List<Aluno> alunos;

    public Turma() {}

    public Long getId() {
        return id;
    }

    public String getAnoLetivo() {
        return anoLetivo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
