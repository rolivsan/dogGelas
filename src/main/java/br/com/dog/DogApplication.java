package br.com.dog;

import br.com.dog.entities.Dog;
import br.com.dog.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DogApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(
			DogRepository dogRepository) {

		return args -> {

			Dog dog1 = new Dog();
			dog1.setName("Border Collie");

			Dog dog2 = new Dog();
			dog2.setName("Shitzu");

			dogRepository.save(dog1);
			dogRepository.save(dog2);

			System.out.println("cachorro salvo com sucesso");


		};

	}
}
