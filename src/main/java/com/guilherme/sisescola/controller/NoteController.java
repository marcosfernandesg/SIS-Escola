package com.guilherme.sisescola.controller;

import com.guilherme.sisescola.model.Note;
import com.guilherme.sisescola.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin(origins = "*")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @PostMapping
    public Note saveNote(@RequestBody Note note) {
        return noteService.salvar(note);
    }


    @GetMapping("/class/{classId}")
    public List<Note> getNotesByClass(@PathVariable Long classId) {
        return noteService.listarPorTurma(classId);
    }
}
