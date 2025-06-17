package br.com.dog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dog")
public class DogController {


    @GetMapping
    public ResponseEntity<String> hello(){
        return ResponseEntity.status(200).body("Olá mundo, meu nome é api do gelas");
    }

}
