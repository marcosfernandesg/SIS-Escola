package com.guilherme.sisescola.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class SchoolClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer schoolYear;

    @OneToMany(mappedBy = "schoolClass", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students;

    // 🔽 GETTERS
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSchoolYear() {
        return schoolYear;
    }

    public List<Student> getStudents() {
        return students;
    }

    // 🔽 SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setSchoolYear(Integer schoolYear) {
        this.schoolYear = schoolYear;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
