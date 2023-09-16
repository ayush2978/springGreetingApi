package com.ayush.springapi.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class GreetingResponse {
    private int id;
    private String name;
    private String message;
}
