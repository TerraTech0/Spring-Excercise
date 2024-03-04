package com.example.excercise;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {

    @GetMapping(path = "/Excercise/name")
    public String name(){
        return "Abdulrahman";
    }
    @GetMapping(path = "/Excercise/age")
    public int age(){
        return 24;
    }
    @GetMapping(path = "/Excercise/check/status")
    public String checkStatus(){
        return "Everything OK";
    }
    @GetMapping(path = "/Excercise/health")
    public String health(){
        return "Server health is up and running";
    }
    @GetMapping(path = "/Excercise/names")
    public String[] names(){
        return new String[]{"Salem", "Waleed","Saud","Sultan","Abdulrahman"};
    }

    @GetMapping(path = "/Excercise/all")
    public String allInfo(){
        return "Name: " + name()
                + "\nAge: " + age()
                + "\nStatus: " + checkStatus()
                + "\nHealth: " + health()
                + "\nNames: " + String.join(", ", names());
    }
}
