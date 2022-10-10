package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarRepository;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository repository;

    @Override
    public List<Car> getCars(int count) {
        return repository.getCars(count);
    }
}
