package br.com.dog.service;

import br.com.dog.entities.Dog;
import br.com.dog.useCase.DogUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {

    @Autowired
    DogUseCase dogUseCase;

    public List<Dog> findAllDog() {
        List<Dog> dogs = dogUseCase.findAllDog();
        return dogs;
    }
}
