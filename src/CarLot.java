import java.util.ArrayList;

public class CarLot {
    private ArrayList<Car> cars;

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
        return null;
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
        return -1;
    }

    public int getNumOfCarsInInventory()
    {
        return -1;
    }

    public String toString()
    {
        return "";
    }
}
