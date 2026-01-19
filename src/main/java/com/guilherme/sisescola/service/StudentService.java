package com.guilherme.sisescola.service;

import com.guilherme.sisescola.model.Student;
import com.guilherme.sisescola.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Camada de serviço responsável
 * pelas regras de negócio do Aluno (Student)
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    /**
     * Retorna todos os alunos
     */
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    /**
     * Busca aluno por ID
     */
    public Student findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    /**
     * Salva ou atualiza um aluno
     */
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    /**
     * Remove aluno por ID
     */
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
