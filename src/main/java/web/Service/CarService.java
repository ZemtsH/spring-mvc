package web.Service;

import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getAllCars();
    public List<Car> getSomeCars(int count);
    public String printCars(Integer count, ModelMap modelMap);
}
