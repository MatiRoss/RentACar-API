package RentACar.dao;

import RentACar.model.Car;
import RentACar.model.CarList;

public interface CarDao {
    public CarList findAll();

    public Car findById(int id);

    public Car save(Car car);

    public void deleteById(int id);

    public void updateById(int id, Car updatedCar);
}
