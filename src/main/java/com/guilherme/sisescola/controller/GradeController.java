package com.guilherme.sisescola.controller;

import com.guilherme.sisescola.model.Grade;
import com.guilherme.sisescola.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/grades")
@CrossOrigin(origins = "*")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @PostMapping
    public Grade saveGrade(@RequestBody Grade grade) {
        return gradeService.save(grade);
    }

    @GetMapping("/student/{studentId}")
    public List<Grade> getGradesByStudent(@PathVariable Long studentId) {
        return gradeService.findByStudentId(studentId);
    }
}