package org.example.carproject.service;



import org.example.carproject.dto.CarDTO;

import java.util.List;

public interface CarService {
    public CarDTO saveCar(CarDTO carDto);

    public List<CarDTO> getCarByModel(String model);

}
