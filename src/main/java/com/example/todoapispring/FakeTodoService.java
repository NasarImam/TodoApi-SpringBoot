package com.example.todoapispring;

import org.springframework.stereotype.Service;

@Service
public class FakeTodoService implements TodoService{

    @TimeMoniter
    public String doSomething(){


        return "from fake todo service";

    }

}
