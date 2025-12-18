package com.guilherme.sisescola.config;

import com.guilherme.sisescola.model.Aluno;
import com.guilherme.sisescola.repository.AlunoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    CommandLineRunner initDatabase(AlunoRepository alunoRepository) {
        return args -> {
            if (alunoRepository.count() == 0) {
                Aluno aluno = new Aluno();
                aluno.setNome("João Silva");
                aluno.setEmail("joao@email.com");
                aluno.setMatricula("2025001");

                alunoRepository.save(aluno);
            }
        };
    }
}
