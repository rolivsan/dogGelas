package br.com.dog.useCase;

import br.com.dog.entities.Dog;
import br.com.dog.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DogUseCase {

    @Autowired
    DogRepository dogRepository;

    public List<Dog> findAllDog() {
        List<Dog> allDogs = dogRepository.findAll();
        return allDogs;
    }
}
