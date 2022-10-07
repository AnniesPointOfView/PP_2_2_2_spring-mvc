package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO{

    private static int COUNT;
    private static final int MAX_COUNT = 5;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++COUNT, "BMW", "Germany", 250));
        cars.add(new Car(++COUNT, "Audi", "Germany", 240));
        cars.add(new Car(++COUNT, "Infiniti", "Japan", 250));
        cars.add(new Car(++COUNT, "Citroen", "France", 220));
        cars.add(new Car(++COUNT, "Ford", "USA", 200));
    }

    public List<Car> getCars(String count) {

        int countOfCars = MAX_COUNT;
        if (count != null) {
            countOfCars = Integer.parseInt(count);
        }

        if (countOfCars >= 5) {
            return cars;
        } else {
            return cars.subList(0, countOfCars);
        }

    }
}
