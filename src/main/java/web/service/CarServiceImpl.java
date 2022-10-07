package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private CarDAOImpl carDAO;

    public CarServiceImpl(CarDAOImpl carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCars(String count) {
        return carDAO.getCars(count);
    }
}
