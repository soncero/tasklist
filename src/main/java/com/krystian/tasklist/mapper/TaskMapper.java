package com.krystian.tasklist.mapper;

import com.krystian.tasklist.domain.Task;
import com.krystian.tasklist.domain.TaskDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class TaskMapper {

    public Task mapToTask(final TaskDto taskDto)
    {
        return new Task(taskDto.getId(), taskDto.getTitle(), taskDto.getContent());
    }
    public TaskDto mapToTaskDto(final Task task)
    {
        return new TaskDto(task.getId(), task.getTitle(), task.getContent());
    }
    public List<TaskDto> mapToTaskDtoList(final List<Task> tasklist)
    {
        return tasklist.stream().map(t-> new TaskDto(t.getId(),t.getTitle(),t.getContent())).collect(Collectors.toList());
    }
}
