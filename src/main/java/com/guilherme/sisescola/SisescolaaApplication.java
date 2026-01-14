package com.guilherme.sisescola;

import com.guilherme.sisescola.model.SchoolClass;
import com.guilherme.sisescola.model.Student;
import com.guilherme.sisescola.repository.SchoolClassRepository;
import com.guilherme.sisescola.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SisescolaaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SisescolaaApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(SchoolClassRepository classRepo, StudentRepository studentRepo) {
		return args -> {
			System.out.println(">>> Banco de dados inicializado com sucesso!");
		};
	}
}