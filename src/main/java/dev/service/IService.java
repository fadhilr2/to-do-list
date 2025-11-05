package dev.service;

import java.util.List;

import dev.models.Status;

public interface IService<Task> {
    void add(Task task);
    void update(Task task);
    boolean delete(int taskId);
    Task getById(int taskId);
    List<Task> getAll();
    List<Task> getByStatus(Status status);
}
