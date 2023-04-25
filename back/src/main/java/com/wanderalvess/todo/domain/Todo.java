package com.wanderalvess.todo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Todo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private LocalDateTime dateFinalization;
    private Boolean finalization = false;

    public Todo() {
        super();
    }

    public Todo(Integer id, String name, String description, LocalDateTime dateFinalization, Boolean finalization) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dateFinalization = dateFinalization;
        this.finalization = finalization;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateFinalization() {
        return dateFinalization;
    }

    public void setDateFinalization(LocalDateTime dateFinalization) {
        this.dateFinalization = dateFinalization;
    }

    public Boolean getFinalization() {
        return finalization;
    }

    public void setFinalization(Boolean finalization) {
        this.finalization = finalization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(id, todo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
