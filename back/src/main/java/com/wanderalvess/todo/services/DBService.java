package com.wanderalvess.todo.services;

import com.wanderalvess.todo.domain.Todo;
import com.wanderalvess.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Service
public class DBService {
    @Autowired
    private TodoRepository todoRepository;

    public void instantiateDatabase() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Todo t1 = new Todo(
                null,
                "Estudar",
                "Estudar Spring Boot e Angular",
                LocalDateTime.parse("04/04/2023 23:15", formatter),
                false);
        Todo t2 = new Todo(
                null,
                "Ler",
                "Ler sobre Spring Boot e Angular",
                LocalDateTime.parse("04/04/2023 23:15", formatter),
                false);
        Todo t3 = new Todo(
                null,
                "Meditar",
                "Meditar Spring Boot e Angular",
                LocalDateTime.parse("04/04/2023 23:15", formatter),
                true);

        todoRepository.saveAll(Arrays.asList(t1, t2, t3));
    }
}
