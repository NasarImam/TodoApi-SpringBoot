package com.example.todoapispring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;


@RestController
public class TodoController {

    private static List<Todo> todos;

    //compostion
     private TodoService todoService;

   public TodoController(TodoService todoService){
       this.todoService = todoService;  //  Assign injected service to class field
       System.out.println(todoService.doSomething());
       todos= new ArrayList<>();
       todos.add(new Todo(1,false,"Todo 1",1) );
       todos.add(new Todo(2,true,"Todo 2",2) );
   }

   @GetMapping("/todos")
   public ResponseEntity<List<Todo>> getTodo(){

       return ResponseEntity.ok(todos);
   }

    @PostMapping("/todos")
    public Todo createTodo(@RequestBody Todo newTodo){

        todos.add(newTodo);
        return newTodo;

    }

}

