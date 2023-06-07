package com.todo.t.Service;

import com.todo.t.bean.Todo;
import com.todo.t.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class TServiceImpl implements TService{

    @Autowired
    private TodoRepo trp;



    @Override
    public Todo addTodo(Todo t) {

        return trp.save(t);


    }

    @Override
    public Todo findById(Integer t) {
        Optional<Todo> ts = trp.findById(t);

        if(ts.isEmpty())
        {
            System.out.println("No data");
        }

            return ts.get();

    }

    @Override
    public List<Todo> findAll() {
        List<Todo> ts = trp.findAll();

        if(ts.isEmpty())
        {
            System.out.println("No data");

        }
         return ts;
    }

    @Override
    public Todo updateTodo(Todo t) {
        Optional<Todo> ts = trp.findById(t.getId());

        if(ts.isEmpty())
        {
            System.out.println("No data");

        }
        return trp.save(t);
    }

    @Override
    public Todo deleteTodo(Todo t) {
        Optional<Todo> ts = trp.findById(t.getId());

        if(ts.isPresent())
        {
            trp.delete(t);
        }
        else
        {
            System.out.println("No data");
        }

        return ts.get();


    }
}
