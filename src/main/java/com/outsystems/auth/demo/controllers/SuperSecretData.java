package com.outsystems.auth.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/secured")
@RestController
public class SuperSecretData {

    @GetMapping("/get-data")
    public String get() {
        return "SUPER SECRET DATA!!!";
    }
}
