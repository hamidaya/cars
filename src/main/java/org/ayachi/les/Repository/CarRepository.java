package org.ayachi.les.Repository;

import org.ayachi.les.Entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository <Car, Long>{
    List<Car> findByBrand(String brand);

}
