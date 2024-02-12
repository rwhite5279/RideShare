/**
 * The Fleet class manages a fleet of Car objects.
 */

 import java.util.ArrayList;

 public class Fleet 
{

    private Car[] cars;
    public static int currentIndex = 0;


    public Fleet(int n)
    {
        cars = new Car[n];
    }

    public void initCar(int loc, int dest)
    {
        cars[currentIndex] = new Car(loc, dest);
        currentIndex++;
    }

    public Car[] getCars()
    {
        return cars;
    }

    public ArrayList<Car> getCarsAtLoc(Station s)
    {
        ArrayList<Car> carsAtLoc = new ArrayList<Car>();
        for (Car car : cars)
        {
            if (car.getLoc() == s.getStationNum())
            {
                carsAtLoc.add(car);
            }
        }
        return carsAtLoc;
    }

    public void moveFleet()
    {
        for (Car car : cars)
            car.move();
    }

    public String toString()
    {
        return "to be implemented";
    }
}
