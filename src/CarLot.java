import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarLot {
    private ArrayList<Car> cars;
    int number_of_cars = 0;

    public CarLot(){
        cars = new ArrayList<>();
    }

    public void addCar(Car car)
    {
        cars.add(car);
    }

    public double getInventoryValue(){

        double priceTotal = 0;

        for (int i = 0; i < cars.size(); i++) {
            priceTotal += cars.get(i).getPrice();
        }

        return priceTotal;
    }

    public ArrayList<Car> getCarsByBrand(String manufacturer)
    {
        String[] car= new String[] {"Ford", "Honda","Porsche"};
        List<String> carsList = Arrays.asList(car);
        String info="";
        return ("");
    }

    public ArrayList<Car> getCarsByModel(String model)
    {
        return null;
    }

    public ArrayList<Car> getCarsBelowPrice(double maxPrice)
    {
        return null;
    }

    public ArrayList<Car> getCarsBelowMileage(double maxkm)
    {
        return null;
    }

    public int getNumOfCarsUnderPrice(double maxPrice)
    {
        return -1;
    }

    public double getAvgPrice()
    {
        double priceAvarage = 0;
        double avarage= 0;

        for (int i = 0; i < cars.size(); i++) {
            priceAvarage += cars.get(i).getPrice();
        }
        avarage= priceAvarage/cars.size();
        return avarage;
    }

    public int getNumOfCarsInInventory()
    {

        for (int i = 0; i < cars.size(); i++) {
            number_of_cars++;
        }
        return number_of_cars;
    }

    public String toString()
    {
        return String.format("We have %1s cars worth $%2s", number_of_cars, inventory_value);
    }
}
