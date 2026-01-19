package com.guilherme.sisescola.service;

import com.guilherme.sisescola.dto.SchoolClassDTO;
import com.guilherme.sisescola.dto.StudentDTO;
import com.guilherme.sisescola.model.SchoolClass;
import com.guilherme.sisescola.model.Student;
import com.guilherme.sisescola.repository.SchoolClassRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Camada de serviço responsável pelas regras
 * de negócio das Turmas (SchoolClass)
 */
@Service
public class SchoolClassService {

    @Autowired
    private SchoolClassRepository schoolClassRepository;

    /**
     * Lista todas as turmas com seus alunos
     */
    public List<SchoolClassDTO> findAll() {
        return schoolClassRepository.findAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }

    /**
     * Busca uma turma pelo ID
     */
    public SchoolClassDTO findById(Long id) {
        SchoolClass sc = schoolClassRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Turma não encontrada"));

        return toDTO(sc);
    }

    /**
     * Cria uma nova turma
     * (sem alunos inicialmente)
     */
    public SchoolClassDTO save(SchoolClassDTO dto) {
        SchoolClass sc = new SchoolClass();
        sc.setName(dto.name());
        sc.setSchoolYear(dto.schoolYear());

        SchoolClass saved = schoolClassRepository.save(sc);
        return toDTO(saved);
    }

    /**
     * Remove uma turma e TODOS os alunos dela
     * (cascade + orphanRemoval)
     */
    @Transactional
    public void deleteById(Long id) {
        SchoolClass sc = schoolClassRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Turma não encontrada"));

        schoolClassRepository.delete(sc);
    }

    /**
     * Converte Entity → DTO
     */
    private SchoolClassDTO toDTO(SchoolClass sc) {
        List<StudentDTO> students = sc.getStudents()
                .stream()
                .map(s -> new StudentDTO(
                        s.getId(),
                        s.getName()
                ))
                .toList();

        return new SchoolClassDTO(
                sc.getId(),
                sc.getName(),
                sc.getSchoolYear(),
                students
        );
    }
}
