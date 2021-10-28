package RentACar.model;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    List<Car> cars;

    public CarList() {
        this.cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
