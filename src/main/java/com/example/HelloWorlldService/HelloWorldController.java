package com.example.HelloWorlldService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(path = "/HelloWorld",method = RequestMethod.GET)
    //@GetMapping("/HelloWorld")
    public String helloWorld(){
        return "Hello World Service";
    }

}
