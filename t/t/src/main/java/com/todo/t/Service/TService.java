package com.todo.t.Service;

import com.todo.t.bean.Todo;

import java.util.List;

public interface TService {

    public Todo addTodo(Todo t);

    public Todo findById(Integer t);

    public List<Todo> findAll();

    public Todo updateTodo(Todo t);

    public Todo deleteTodo(Todo id);

}
