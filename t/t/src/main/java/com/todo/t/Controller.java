package com.todo.t;

import com.todo.t.Service.TServiceImpl;
import com.todo.t.bean.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class Controller {

    @Autowired
    private TServiceImpl trp;


    @PostMapping("/add")
    public ResponseEntity<Todo> addT(@RequestBody Todo  t ){

       Todo f= trp.addTodo(t);

       return new ResponseEntity<Todo>(f, HttpStatus.CREATED);
    }









}
