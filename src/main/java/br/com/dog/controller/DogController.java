package br.com.dog.controller;

import br.com.dog.entities.Dog;
import br.com.dog.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dog")
public class DogController {

    @Autowired
    DogService dogService;


    @GetMapping
    public ResponseEntity<List<Dog>> findAllDog(){
        List<Dog> dogs = dogService.findAllDog();
        return ResponseEntity.status(200).body(dogs);
    }

    //@GetMapping("/{id}")
    //TODO implementar o findById
    //(@PathVariable Long id)

}
