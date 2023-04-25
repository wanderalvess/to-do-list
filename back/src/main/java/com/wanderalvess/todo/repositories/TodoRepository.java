package com.wanderalvess.todo.repositories;

import com.wanderalvess.todo.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    @Query("SELECT obj FROM Todo obj WHERE obj.finalization = false order by obj.dateFinalization")
    List<Todo> findAllOpen();

    @Query("SELECT obj FROM Todo obj WHERE obj.finalization = true order by obj.dateFinalization")
    List<Todo> findAllClose();
}
