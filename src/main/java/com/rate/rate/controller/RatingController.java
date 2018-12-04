package com.rate.rate.controller;

import io.swagger.models.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rate")
public class RatingController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return "Hello! I'm a rating service";
    }

}
