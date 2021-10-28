package RentACar.dao;

import RentACar.model.Car;
import RentACar.model.CarList;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    List<Car> cars = new ArrayList<>();

    public CarDaoImpl() {
        cars.add(new Car(0, "Ford", "Verte", 8000));
        cars.add(new Car(1, "Mercedes", "Rouge", 10000));
        cars.add(new Car(2, "BMW", "Noir", 50000));
        cars.add(new Car(3, "Fiat", "Verte", 4000));
        cars.add(new Car(4, "Peugeot", "Bleue", 7000));
        cars.add(new Car(5, "Renault", "Jaune", 9000));
        cars.add(new Car(6, "Ferrari", "Grise", 1000000));
    }

    @Override
    public CarList findAll() {
        CarList carList = new CarList();
        carList.setCars(cars);
        return carList;
    }

    @Override
    public Car findById(int id) {
        for (Car car : cars) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    @Override
    public Car save(Car car) {
        car.setId(cars.size());
        cars.add(car);
        return car;
    }

    @Override
    public void deleteById(int id) {
        cars.removeIf(car -> car.getId() == id);
    }

    @Override
    public void updateById(int id, Car updatedCar) {
        Car carToUpdate = findById(id);
        carToUpdate.setBrand(updatedCar.getBrand());
        carToUpdate.setColor(updatedCar.getColor());
        carToUpdate.setPrice(updatedCar.getPrice());
    }
}
