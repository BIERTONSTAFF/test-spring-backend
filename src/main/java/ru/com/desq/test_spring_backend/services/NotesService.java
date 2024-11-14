package ru.com.desq.test_spring_backend.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.com.desq.test_spring_backend.entities.Note;
import ru.com.desq.test_spring_backend.repositories.NotesRepository;

@Service
public class NotesService {

    @Autowired
    private NotesRepository repository;

    public NotesService() {}

    public Note create(Note note) {
        return repository.save(note);
    }

    public Optional<Note> getById(String id) {
        return repository.findById(id);
    }

    public List<Note> list() {
        return repository.findAll();
    }
}
