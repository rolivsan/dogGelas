package br.com.dog.useCase;

import br.com.dog.entities.Dog;
import br.com.dog.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Component
public class DogUseCase {

    @Autowired
    DogRepository dogRepository;

    public List<Dog> findAllDog() {
        List<Dog> allDogs = dogRepository.findAll();
        return allDogs;
    }

    public Dog findById(Long id){
        Optional <Dog> dogs = dogRepository.findById(id);
        return dogs.get();
    }
}
