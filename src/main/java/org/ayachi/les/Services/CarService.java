package org.ayachi.les.Services;
import org.ayachi.les.Entities.Car;
import org.ayachi.les.Repository.CarRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }
    public List<Car> getCars(String brand) {
        if (brand != null) {
            return carRepository.findByBrand(brand);
        }
        return carRepository.findAll();
    }
} 