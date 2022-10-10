package web.repository;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarRepositoryImpl implements CarRepository {

    private static int COUNT;

    private static List<Car> cars;

    static {
        cars = new ArrayList<>();
        cars.add(new Car(++COUNT, "BMW", "Germany", 250));
        cars.add(new Car(++COUNT, "Audi", "Germany", 240));
        cars.add(new Car(++COUNT, "Infiniti", "Japan", 250));
        cars.add(new Car(++COUNT, "Citroen", "France", 220));
        cars.add(new Car(++COUNT, "Ford", "USA", 200));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count <= 0 || count > 5 ?  cars.size() : count).collect(Collectors.toList());
    }
}
