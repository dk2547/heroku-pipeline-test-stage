package com.sam.herokupipelineteststage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/hello")
    String hello(){
        return "server is up";
    }
}
