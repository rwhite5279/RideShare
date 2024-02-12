/**
 * The Fleet class manages a fleet of Car objects.
 */

 import java.util.ArrayList;


 /**
  * The Fleet class describes a collection of cars that will move
  * along a section of road connected by stations.
  */
 public class Fleet 
{

    private Car[] cars;
    public static int currentIndex = 0;


    /**
     * Initializes the fleet by declaring an Array of Car objects.
     * @param n the number of cars in the fleet
     */
    public Fleet(int n)
    {
        cars = new Car[n];
    }

    /**
     * Initializes a single car in the fleet
     * @param loc the starting location (station) of the car
     * @param dest the final location (station) of the car
     */
    public void initCar(int loc, int dest)
    {
        cars[currentIndex] = new Car(loc, dest);
        currentIndex++;
    }

    /**
     * Returns the Array of all the cars
     * @return an Array of all Car objects
     */
    public Car[] getCars()
    {
        return cars;
    }

    /**
     * Identifies all the cars at a given location
     * @param s a station number
     * @return an ArrayList of the cars currently at that station
     */
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

    /**
     * Moves every car in the fleet according to its direction
     * (Not currently used by the Runner/Tester)
     */
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
