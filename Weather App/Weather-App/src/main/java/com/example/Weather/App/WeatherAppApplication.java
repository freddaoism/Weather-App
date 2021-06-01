package com.example.Weather.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.Weather.App.Model.Person;
import java.util.Arrays;

@SpringBootApplication
public class WeatherAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(WeatherAppApplication.class, args);


//		Person person = new Person();
//		person.firstName = "John";
//		person.lastName = "Doe";
//		person.age = 45;
//		person.favoriteFoods = Arrays.asList("Pizza", "Sushi", "Burgers");
//		System.out.println(person);
	}
}
