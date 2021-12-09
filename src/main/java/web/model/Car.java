package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String carName;
    private String carCompany;
    private String carYear;

    public Car(String carName, String carCompany, String carYear) {
        this.carName = carName;
        this.carCompany = carCompany;
        this.carYear = carYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carCompany='" + carCompany + '\'' +
                ", carYear='" + carYear + '\'' +
                '}';
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }
}
