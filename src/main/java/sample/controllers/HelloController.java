package sample.controllers;

import sample.dto.HelloDto;
import sample.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(value = "/")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public HelloDto sayHello() {
        return helloService.sayHello();
    }

}