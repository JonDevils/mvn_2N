package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImp implements CarService{
    private final List<Car> listCars;

    public CarServiceImp() {
        listCars = new ArrayList<>();
        listCars.add(new Car("Aston Matrin", 10, "First"));
        listCars.add(new Car("Bentley", 20, "Second"));
        listCars.add(new Car("DODGE", 30, "Third"));
        listCars.add(new Car("Eagle", 40, "Fourth"));
        listCars.add(new Car("FIAT", 5, "Fifth"));
    }

    @Override
    public List<Car> getAllCars() {
        return listCars;
    }

    @Override
    public List<Car> getAmountCars(int amount) {
        return listCars.stream().limit(amount).collect(Collectors.toList());
    }
}
