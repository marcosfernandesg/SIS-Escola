package com.guilherme.sisescola.model;

import jakarta.persistence.*;

@Entity
public class Assessment {

    //Identificador técnico da avaliação, gerado pelo banco
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Aluno ao qual essa avaliação pertence
    @ManyToOne
    private Student student;

    //grade: "Nota do aluno" | absences: “Número de faltas do aluno
    private double grade;
    private int absences;
    private String description;

}
