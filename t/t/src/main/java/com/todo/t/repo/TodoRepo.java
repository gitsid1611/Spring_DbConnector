package com.todo.t.repo;

import com.todo.t.bean.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface TodoRepo extends JpaRepository<Todo,Integer> {


}
