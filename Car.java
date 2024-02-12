/**
 * The Car class tracks a car, its location, and its passengers.
 */

import java.util.ArrayList;

public class Car
{
    
    private int loc;
    private int dest;
    private int miles;
    private int passengerMiles;
    private ArrayList<Passenger> passengers;
    public static final int MAX_PASSENGERS = 3;
    /**
     * The Car class tracks a car in the RideShare project.
     * @param loc the current location of the car, a Station number
     * @param dest the final destination of the car, a Station number
     */
    public Car(int loc, int dest)
    {
        this.loc = loc;
        this.dest = dest;
        miles = 0;
        passengerMiles = 0;
        passengers = new ArrayList<Passenger>();
    }

    /**
     * Identifies the current location of the car
     * @return the car's location, a Station number
     */
    public int getLoc()
    {
        return loc;
    }

    /**
     * Identifies the final destination of the car
     * @return the final destination, a Station number
     */
    public int getDest()
    {
        return dest;
    }

    /**
     * Moves the car one station in the correct direction,
     * assuming the car has not reached its final destination.
     * Updates miles (one for each station, regardless of direction),
     * and passengerMiles, one for each passenger carried.
     */
    public void move()
    {
        if (loc != dest)
        {
            if (loc < dest)
                loc++;
            else // (loc > dest)
                loc--; 
            miles++;
            passengerMiles += passengers.size();
        }
    }

    /**
     * Allows for th addition of a passenger to our car, as long 
     * as there's room and the passenger is heading in the same 
     * direction.
     * @param p a Passenger to add to this car
     * @return true if we were able to add the passenger, which the Runner should be confirming; otherwise, false
     */
    public boolean addPassenger(Passenger p)
    {
        if (passengers.size() < MAX_PASSENGERS &&
            (p.getLoc() < p.getDest() && this.loc < this.dest) ||
            (p.getLoc() > p.getDest() && this.loc > this.dest))
        {
            passengers.add(p);
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Checks to see if any passengers here should exit the car, based on
     *      1) the passenger has arrived at their destination, or
     *      2) the car has arrived at its destination and there's a
     *         passenger who hasn't reached their yet.
     *  @param an ArrayList of Passengers leaving the car
     */
    public ArrayList<Passenger> removePassengers()
    {
        ArrayList<Passenger> exiting = new ArrayList<Passenger>();
        for (int i = passengers.size() - 1; i >= 0; i--)
        {
            if (passengers.get(i).getLoc() == this.loc ||
                this.loc == this.dest)
            {
                exiting.add(passengers.get(i));
                passengers.remove(i);
            }
        }
        return exiting;
    }

    /**
     * Identifies how many passengers are currently in the car
     * @return the number of passengers in the car
     */
    public int getPassengerCount()
    {
        return passengers.size();
    }

    /**
     * Identifies the total number of miles the car has travelled
     * @return the number of miles traveled (ie. "odometer reading")
     */
    public int getMilesTraveled()
    {
        return miles;
    }

    /**
     * Returns the number of passenger-miles the car has had, where
     * three passsengers riding for two miles would be six passenger-miles.
     * Can be used to determine earnings.
     * @return the current total number of passenger miles for this car
     */
    public int getPassengerMiles()
    {
        return passengerMiles;
    }

    /**
     * Overrides the toString method
     * @return a string representation of the car, including passengers currently being carried
     */
    public String toString()
    {
        String result = super.toString() + "[loc=" + loc + ",dest=" + dest +
                                  ",passengers=[";
        for (int i = 0; i < passengers.size(); i++)
        {
            if (i > 0)
                result += ",";
            result += passengers.get(i);
        } 
        result += "],miles=" + miles + ",passengerMiles=" + passengerMiles + "]";
        return result;
    }
}
