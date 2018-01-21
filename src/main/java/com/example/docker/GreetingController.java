/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.docker;

import java.time.LocalTime;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
public class GreetingController {
    @RequestMapping(path = "/time", method = GET)
    public String sayHelloWorld(){
        return "Hello World @ " + LocalTime.now();
    }
}
