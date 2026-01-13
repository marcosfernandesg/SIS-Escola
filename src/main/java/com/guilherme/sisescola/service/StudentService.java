package com.guilherme.sisescola.service;

import com.guilherme.sisescola.model.Student;
import com.guilherme.sisescola.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Camada de Serviço - Aqui ficam as regras de negócio
 * É como um "gerente" que coordena as operações
 */
@Service  // Esta anotação diz ao Spring: "Ei, esta é uma classe de serviço!"
public class StudentService {

    /**
     * @Autowired = Injeção de Dependência
     * O Spring automaticamente cria um StudentRepository e "injeta" aqui
     * Você não precisa fazer: new StudentRepository()
     * O Spring faz isso por você!
     */
    @Autowired
    private StudentRepository studentRepository;

    /**
     * Busca TODOS os alunos do banco de dados
     *
     * @return List<Student> - Uma lista com todos os alunos
     */
    public List<Student> findAll() {
        // studentRepository.findAll() já vem pronto do JpaRepository
        // Ele busca tudo da tabela "student"
        return studentRepository.findAll();
    }

    /**
     * Salva um novo aluno OU atualiza um existente
     *
     * @param student - O aluno a ser salvo
     * @return Student - O aluno salvo (agora com ID gerado pelo banco)
     */
    public Student save(Student student) {
        // studentRepository.save() também já vem pronto
        // Se o aluno não tem ID, ele CRIA um novo
        // Se o aluno já tem ID, ele ATUALIZA
        return studentRepository.save(student);
    }

    /**
     * Deleta um aluno pelo ID
     *
     * @param id - O ID do aluno a ser deletado
     */
    public void deleteById(Long id) {
        // Deleta o aluno com esse ID
        studentRepository.deleteById(id);
    }

    /**
     * Busca um aluno específico pelo ID
     *
     * @param id - O ID do aluno
     * @return Student - O aluno encontrado (ou null se não existir)
     */
    public Student findById(Long id) {
        // findById retorna um Optional<Student>
        // .orElse(null) significa: se não encontrar, retorna null
        return studentRepository.findById(id).orElse(null);
    }
}