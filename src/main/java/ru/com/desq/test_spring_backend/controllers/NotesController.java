package ru.com.desq.test_spring_backend.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.com.desq.test_spring_backend.dtos.NoteDto;
import ru.com.desq.test_spring_backend.entities.Note;
import ru.com.desq.test_spring_backend.services.NotesService;

@RestController
@RequestMapping("/notes")
public class NotesController {

    @Autowired
    private NotesService service;

    @PostMapping("/")
    Note createNote(@RequestBody NoteDto dto) {
        return service.create(dto.toNote());
    }

    @GetMapping("/")
    List<Note> list() {
        return service.list();
    }

    @GetMapping("/id/{id}")
    ResponseEntity<Note> getById(@PathVariable String id) {
        return service
            .getById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }
}
