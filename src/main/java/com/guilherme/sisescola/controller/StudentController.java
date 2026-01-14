package com.guilherme.sisescola.controller;

import com.guilherme.sisescola.model.Student;
import com.guilherme.sisescola.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller = Porteiro da API
 * Recebe requisições HTTP e retorna respostas
 */
@RestController  // Diz: "Sou um controlador REST"
@RequestMapping("/api/student")  // URL base: localhost:8080/api/students
@CrossOrigin(origins = "*")  // Permite que o frontend acesse (CORS)
public class StudentController {

    // Injeta o Service (não o Repository!)
    // Controller → Service → Repository (camadas!)
    @Autowired
    private StudentService studentService;

    /**
     * GET /api/students
     * Retorna TODOS os alunos
     */
    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.findAll();
    }

    /**
     * GET /api/students/5
     * Retorna o aluno com ID = 5
     *
     * @PathVariable captura o {id} da URL
     */
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    /**
     * POST /api/students
     * Cria um novo aluno
     *
     * @RequestBody converte o JSON do frontend em objeto Student
     */
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    /**
     * DELETE /api/students/5
     * Deleta o aluno com ID = 5
     */
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteById(id);
    }
}