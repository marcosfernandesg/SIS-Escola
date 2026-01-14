package com.guilherme.sisescola.controller;

import com.guilherme.sisescola.model.SchoolClass;
import com.guilherme.sisescola.service.SchoolClassService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void deleteSchoolClass(@PathVariable Long id){
        schoolClassService.deleteById(id);
    }
}
