package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Volkswagen", "VW", "2001"));
        cars.add(new Car("Skoda", "VW", "2002"));
        cars.add(new Car("Seat", "VW", "2003"));
        cars.add(new Car("Audi", "VW", "2004"));
        cars.add(new Car("Scania", "VW", "2005"));
    }

    @Override
    public List<Car> getAllCars() {
        return Collections.unmodifiableList(cars);
    }

    @Override
    public List<Car> getSomeCars(int count) {
        return Collections.unmodifiableList(cars.subList(0, count));
    }

    @Override
    public String printCars(Integer count, ModelMap modelMap) {
        List<Car> cars;
        if (count >= 5) {
            cars = getAllCars();
        } else {
            cars = getSomeCars(count);
        }
        modelMap.addAttribute("messages", cars);
        return "cars";
    }
}
