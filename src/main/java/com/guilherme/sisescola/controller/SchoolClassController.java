package com.guilherme.sisescola.controller;

import com.guilherme.sisescola.dto.SchoolClassDTO;
import com.guilherme.sisescola.service.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller REST das Turmas
 */
@RestController
@RequestMapping("/api/schoolclass")
@CrossOrigin(origins = "*")
public class SchoolClassController {

    @Autowired
    private SchoolClassService schoolClassService;

    /**
     * GET /api/schoolclass
     * Lista todas as turmas com alunos
     */
    @GetMapping
    public ResponseEntity<List<SchoolClassDTO>> getAll() {
        return ResponseEntity.ok(schoolClassService.findAll());
    }

    /**
     * GET /api/schoolclass/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<SchoolClassDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(schoolClassService.findById(id));
    }

    /**
     * POST /api/schoolclass
     */
    @PostMapping
    public ResponseEntity<SchoolClassDTO> create(@RequestBody SchoolClassDTO dto) {
        return ResponseEntity.ok(schoolClassService.save(dto));
    }

    /**
     * DELETE /api/schoolclass/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        schoolClassService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
