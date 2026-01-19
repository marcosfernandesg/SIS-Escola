package com.guilherme.sisescola.dto;

import java.util.List;

/**
 * DTO da Turma (SchoolClass)
 * Contém os alunos associados
 */
public record SchoolClassDTO(
        Long id,
        String name,
        Integer schoolYear,
        List<StudentDTO> students
) {}
