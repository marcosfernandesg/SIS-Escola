    package com.guilherme.sisescola.model;

    import com.fasterxml.jackson.annotation.JsonBackReference;
    import com.fasterxml.jackson.annotation.JsonManagedReference;
    import jakarta.persistence.*;

    import java.util.ArrayList;
    import java.util.List;

    @Entity
    @Table(name = "student")
    public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "school_class_id")
        @JsonBackReference
        private SchoolClass schoolClass;

        @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
        @JsonManagedReference
        private List<Grade> grades = new ArrayList<>();
        public Student() {
        }

        // Getter e Setter
        public List<Grade> getGrades() { return grades; }

        public void setGrades(List<Grade> grades) { this.grades = grades; }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public SchoolClass getSchoolClass() {
            return schoolClass;
        }

        public void setSchoolClass(SchoolClass schoolClass) {
            this.schoolClass = schoolClass;
        }
    }