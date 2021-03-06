package com.krystian.tasklist.repository;

import com.krystian.tasklist.domain.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository  extends CrudRepository<Task,Long> {

    @Override
    List<Task> findAll();

    @Override
    Optional<Task> findById(Long aLong);

    @Override
    Task save(Task task);

    @Override
    void deleteById(Long aLong);


}
