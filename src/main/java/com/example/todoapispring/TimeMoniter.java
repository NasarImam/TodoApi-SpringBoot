package com.example.todoapispring;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// now we have to define this annotation will be applicable on what ex; function or class
//for that we need to define it
@Target(ElementType.METHOD)

// now we need to tell this annotation will be run at Runtime or Compile time for that
@Retention(RetentionPolicy.RUNTIME)
public @interface TimeMoniter {
}
