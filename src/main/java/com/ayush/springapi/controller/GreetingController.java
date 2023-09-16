package com.ayush.springapi.controller;

import com.ayush.springapi.model.GreetingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class GreetingController {
    @Autowired
    GreetingResponse greetingResponse;
    private AtomicInteger atomicInteger=new AtomicInteger();
    @GetMapping("/greeting")
    public GreetingResponse getGreeting(@RequestParam(value = "name") String name){
        try {
            greetingResponse.setId(atomicInteger.getAndIncrement());
            greetingResponse.setName("Hello " + name);
            greetingResponse.setMessage("Success");
        }catch (Exception e){
            greetingResponse.setMessage("Failure in getting greeting");
        }
        return greetingResponse;
    }
}
