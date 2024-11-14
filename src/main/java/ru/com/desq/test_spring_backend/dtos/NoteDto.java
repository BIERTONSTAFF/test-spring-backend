package ru.com.desq.test_spring_backend.dtos;

import ru.com.desq.test_spring_backend.entities.Note;

public class NoteDto {

    public String name;
    public String content;

    public Note toNote() {
        return new Note(this.name, this.content);
    }
}
