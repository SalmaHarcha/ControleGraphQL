package org.example.carproject.service;

import lombok.AllArgsConstructor;
import org.example.carproject.dao.entities.Car;
import org.example.carproject.dao.repositories.CarRepository;
import org.example.carproject.dto.CarDTO;
import org.example.carproject.mapper.CarMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class CarManager implements CarService {

    private CarRepository carRepository;
    private CarMapper carMapper;

    @Override
    public CarDTO saveCar(CarDTO carDto) {
        Car car = carMapper.fromCarDtoToCar(carDto);
        car = carRepository.save(car);
        carDto = carMapper.fromCarToCarDto(car);
        return carDto;
    }

    @Override
    public List<CarDTO> getCarByModel(String model) {
        List<Car> cars = carRepository.findByModel(model);
        List<CarDTO> carDtos = new ArrayList<>();
        for (Car car : cars) {
            carDtos.add(carMapper.fromCarToCarDto(car));
        }
        return carDtos;
    }


}
