package TASK4;
import java.util.HashMap;
public class Car {
    public enum Brand{
        SKODA,MAZDA,VOLVO,BMW
    }

    private Brand brand;
    private String rNumber;



    public Car(String rNumber, Brand brand) {
        this.rNumber = rNumber;
        this.brand = brand;

    }


    public Brand getBrand() {
        return brand;
    }

    public String getrNumber() {
        return rNumber;
    }
}
