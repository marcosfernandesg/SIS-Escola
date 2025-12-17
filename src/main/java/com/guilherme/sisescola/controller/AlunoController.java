package com.guilherme.sisescola.controller;

import com.guilherme.sisescola.model.Aluno;
import com.guilherme.sisescola.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @PostMapping
    public Aluno criar(@RequestBody Aluno aluno) {
        return service.salvar(aluno);
    }

    @GetMapping
    public List<Aluno> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Aluno buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Aluno atualizar(@PathVariable Long id, @RequestBody Aluno aluno) {
        return service.atualizar(id, aluno);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
