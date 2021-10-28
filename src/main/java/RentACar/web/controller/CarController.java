package RentACar.web.controller;

import RentACar.dao.CarDao;
import RentACar.dao.CarDaoImpl;
import RentACar.model.Car;
import RentACar.model.CarList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarDao carDao;

    @GetMapping(value = "/cars")
    public CarList listAll() {
        return carDao.findAll();
    }

    @GetMapping(value = "/cars/{id}")
    public Car showOneCar(@PathVariable int id) {
        return carDao.findById(id);
    }

    @PostMapping(value = "/cars")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Car addOneCar(@RequestBody Car car) {
        return carDao.save(car);
    }

    @DeleteMapping(value = "/cars/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteOneCar(@PathVariable int id) {
        carDao.deleteById(id);
    }

    @PutMapping(value = "/cars/{id}")
    public void update(@PathVariable int id, @RequestBody Car car) {
        carDao.updateById(id, car);
    }

}