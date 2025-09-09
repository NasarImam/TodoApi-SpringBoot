package com.example.todoapispring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// to create the logic of behind annotations used @Aspect
@Aspect
@Component
public class TimeMonitorAspect {

    // to let the fuction know that at attaching  @TimeMoniter annotation this function must execute
    //this is advices of the program
    @Around("@annotation(TimeMoniter)")
    public void logTime(ProceedingJoinPoint joinPoint){
        long start= System.currentTimeMillis();

        //execute join point
      try{
          // join point where @TimeMoniter annotated function execute
          joinPoint.proceed();

      } catch (Throwable t){

          System.out.println("something went wrong");

      } finally {

          long end= System.currentTimeMillis();
          long total=end-start;
          System.out.println(total);

      }



    }
}
