package TASK4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person smith = new Person("Oliver", "Smith");
        Person jones = new Person("Jack", "Jones");
        Person harry = new Person("Harry", "Williams");
        Person jacob = new Person("Jacob", "Brown");

        Car skoda1 = new Car("WA00001", Car.Brand.SKODA);
        Car skoda2 = new Car("SC36010", Car.Brand.SKODA);
        Car mazda1 = new Car("WA01234", Car.Brand.MAZDA);
        Car mazda2 = new Car("DW01ASD", Car.Brand.MAZDA);
        Car bmw = new Car("WA12690", Car.Brand.BMW);
        Car volvo = new Car("KR60606", Car.Brand.VOLVO);

        Map<Person, List<Car>> carMap = new HashMap<Person, List<Car>>();
        carMap.put(smith, Arrays.asList(skoda1, bmw));
        carMap.put(jones, Arrays.asList(mazda2));
        carMap.put(harry, Arrays.asList(volvo, mazda1, skoda2));
        carMap.put(jacob, new ArrayList<>());

        for (Map.Entry<Person, List<Car>> entry : carMap.entrySet()) {
            Person person = entry.getKey();
            List<Car> cars = entry.getValue();

            System.out.print(person.getName() + " " + person.getSurname() + " -> ");
            if (cars.isEmpty()) {
                System.out.print("[No Car]");
                System.out.println();
            } else {
                for (int i = 0; i < cars.size(); i++) {
                    if (i > 0) System.out.print(", ");
                    System.out.print(cars.get(i).getBrand() + " " + cars.get(i).getrNumber());
                }
                System.out.println();
            }
        }
        System.out.println("\nCars whose registration number begins with 'WA':");
        for (Map.Entry<Person, List<Car>> entry : carMap.entrySet()) {
            List<Car> cars = entry.getValue();
            for (Car car :
                    cars) {
                    if(car.getrNumber().startsWith("WA")){
                        System.out.println(car.getBrand() + " " + car.getrNumber());
                    }


            }
        }
        System.out.println(carMap.get(jones).get(0));
    }

}
