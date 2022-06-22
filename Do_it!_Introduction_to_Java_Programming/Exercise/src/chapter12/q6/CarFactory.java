package chapter12.q6;

import java.util.HashMap;

public class CarFactory {

    private CarFactory() {}

    private static CarFactory factory = new CarFactory();
    HashMap<String, Car> carMap = new HashMap<String, Car>();

    public static CarFactory getInstance() {
        return factory;
    }
    
    public Car createCar(String name) {
        if(carMap.containsKey(name)) {
            return carMap.get(name);
        }
        Car car = new Car(name);
        carMap.put(name, car);
        return car;
    }
}
