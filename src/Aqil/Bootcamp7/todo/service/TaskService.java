package Aqil.Bootcamp7.todo.service;

import Aqil.Bootcamp7.todo.entity.Task;

public interface TaskService {
    void createTask(Task task);
    void updateTask(long id,Task task);
    void deleteTask(long id);
    Task getTask(long id);
    Task[] getAllTask();

}
