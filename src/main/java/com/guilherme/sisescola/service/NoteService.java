package com.guilherme.sisescola.service;

import com.guilherme.sisescola.model.Note;
import com.guilherme.sisescola.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Note salvar(Note note) {
        // A lógica de data já está no construtor da Model,
        // mas aqui poderíamos validar se o conteúdo não está vazio.
        if (note.getContent() == null || note.getContent().isEmpty()) {
            throw new RuntimeException("O conteúdo da nota não pode estar vazio");
        }
        return noteRepository.save(note);
    }


    public List<Note> listarPorTurma(Long classId) {
        return noteRepository.findBySchoolClassIdOrderByCreatedAtDesc(classId);
    }
}