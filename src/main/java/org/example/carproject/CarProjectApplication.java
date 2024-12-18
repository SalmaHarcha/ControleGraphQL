package org.example.carproject;

import org.example.carproject.dto.CarDTO;
import org.example.carproject.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CarProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarProjectApplication.class, args);
    }


    @Bean
    CommandLineRunner start(CarService carService){
        return  args -> {
            carService.saveCar(CarDTO.builder().model("clio").color("red").matricul("230WW").price(240000).build());
            carService.saveCar(CarDTO.builder().model("kia").color("blue").matricul("231WW").price(240000).build());
            carService.saveCar(CarDTO.builder().model("renault").color("black").matricul("232WW").price(240000).build());
            carService.saveCar(CarDTO.builder().model("peugeot").color("white").matricul("233WW").price(240000).build());
        };
    }

}
