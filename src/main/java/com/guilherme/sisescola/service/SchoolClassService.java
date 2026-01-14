package com.guilherme.sisescola.service;


import com.guilherme.sisescola.model.SchoolClass;
import com.guilherme.sisescola.repository.SchoolClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolClassService {

    @Autowired
    private SchoolClassRepository schoolClassRepository;

    public List<SchoolClass> findAll() {
        return schoolClassRepository.findAll();
    }

    public SchoolClass save(SchoolClass schoolClass){
        return schoolClassRepository.save(schoolClass);
    }

    public void deleteById(Long id){
        schoolClassRepository.deleteById(id);
    }

    public SchoolClass findById(Long id) {
        return schoolClassRepository.findById(id).orElse(null);
    }
}
