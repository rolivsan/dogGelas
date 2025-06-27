package br.com.dog.service;

import br.com.dog.entities.Dog;
import br.com.dog.useCase.DogUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class DogService {

    @Autowired
    DogUseCase dogUseCase;

    public List<Dog> findAllDog() {
        List<Dog> dogs = dogUseCase.findAllDog();
        return dogs;
    }

    public Dog findById(Long id){
        Dog dogs = dogUseCase.findById(id);
        return dogs;
    }

}
