package com.guilherme.sisescola.controller;

import com.guilherme.sisescola.model.SchoolClass;
import com.guilherme.sisescola.service.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schoolclass")
@CrossOrigin(origins = "*")
public class SchoolClassController {


    @Autowired
    private SchoolClassService schoolClassService;

    @GetMapping
    public List<SchoolClass> getAllSchoolClass(){
        return schoolClassService.findAll();
    }

    @GetMapping("/{id}")
    public SchoolClass getSchoolClassById(@PathVariable Long id){
        return schoolClassService.findById(id);
    }

    @PostMapping
    public SchoolClass createSchoolClass(@RequestBody SchoolClass schoolClass){
        return schoolClassService.save(schoolClass);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSchoolClass(@PathVariable Long id) {
        try {
            schoolClassService.deleteById(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace(); // ← Isso vai mostrar o erro no terminal
            return ResponseEntity.status(500).build();
        }
    }
}
