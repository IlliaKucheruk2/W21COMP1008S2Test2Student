import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Name:Illia Kucheruk
 * Student number: 200453638
 */
public class Car {
    private String make, model;
    private int mileage;
    private double price;

    public Car(String make, String model, int mileage, double price) {
        setMake(make);
        setModel(model);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    public static List<String> getName(){
        return Arrays.asList("Ford", "Honda", "Porsche");
    }

    public void setMake(String make) {
        List<String> validMake = getName();
        if(validMake.contains(make)){
            this.make = make;
        }
        else {
            throw new IllegalArgumentException("Error. You can use " + validMake);
        }

    }

    public void setModel(String model) {
    }

    public void setMileage(int mileage) {
    }

    public void setPrice(double price) {
    }

    public String toString()
    {
        return "";
    }
}
