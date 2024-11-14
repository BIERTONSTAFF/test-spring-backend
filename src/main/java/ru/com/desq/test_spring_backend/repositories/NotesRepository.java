package ru.com.desq.test_spring_backend.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.com.desq.test_spring_backend.entities.Note;

public interface NotesRepository extends MongoRepository<Note, String> {}
