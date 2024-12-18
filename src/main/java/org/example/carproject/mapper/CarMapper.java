package org.example.carproject.mapper;



import org.example.carproject.dao.entities.Car;
import org.example.carproject.dto.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Car fromCarDtoToCar(CarDTO carDto){
        return mapper.map(carDto, Car.class);
    }

    public CarDTO fromCarToCarDto(Car car){
        return mapper.map(car, CarDTO.class);
    }

}