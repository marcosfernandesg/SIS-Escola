package com.guilherme.sisescola.service;

import com.guilherme.sisescola.model.Grade;
import com.guilherme.sisescola.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    public Grade save(Grade grade) {
        return gradeRepository.save(grade);
    }

    public List<Grade> findByStudentId(Long studentId) {
        return gradeRepository.findByStudentId(studentId);
    }
}