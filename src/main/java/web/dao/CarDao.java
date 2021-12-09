package web.dao;

import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> getAllCars();
    public List<Car> getSomeCars(int count);
    public String printCars(Integer count, ModelMap modelMap);
}
