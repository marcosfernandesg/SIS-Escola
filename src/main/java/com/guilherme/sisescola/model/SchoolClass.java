package com.guilherme.sisescola.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Entidade que representa uma turma escolar.
 * Agrupa alunos de um mesmo ano/série.
 */
@Entity
public class SchoolClass {

    /**
     * Identificador técnico da turma.
     * Gerado automaticamente pelo banco de dados.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nome visível da turma (ex: "3rd Grade A").
     */
    private String name;

    /**
     * Ano letivo da turma (ex: 2026).
     */
    private Integer year;
}
