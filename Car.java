/**
 * The Car class tracks a car, its location, and its passengers.
 */

import java.util.ArrayList;

public class Car
{
    
    private int loc;
    private int dest;
    private int miles;
    private ArrayList<Passenger> passengers;
    public final int MAX_PASSENGERS = 3;
    /**
     * The Car class tracks a car in the RideShare project.
     */
    public Car(int loc, int dest)
    {
        this.loc = loc;
        this.dest = dest;
        miles = 0;
        passengers = new ArrayList<Passenger>();
    }

    public int getLoc()
    {
        return loc;
    }

    public int getDest()
    {
        return dest;
    }

    public void move()
    {
        if (loc < dest)
        {
            loc++;
            miles++;
        }
        else if (loc > dest)
        {
            loc--; 
            miles++;
        }
    }
 
    public int getPassengerCount()
    {
        return passengers.size();
    }

    public int getMilesTraveled()
    {
        return miles;
    }

    /**
     * Checks current location and our list of passengers to see
     * if we can drop any of them off.
     */
    public void dropoff(Station s)
    {
        for (int i = passengers.size() - 1; i >= 0; i--)
        {
            if (passengers.get(i).getDest() == this.loc)
                passengers.remove(i);
            else if (this.dest == s.getStationNum())
                s.addWaiting(passengers.remove(i));
        }
    }

    /**
     * Checks to see if there's room in the car, onfirms that the 
     * passenger is heading in the same direction as the car, and 
     * adds them to our list of current passengers.
     * Code here duplicates what might be happening in the Tester/Runner.
     * @param pass a Passenger object to put into car
     * @return true if we were able to add them
     */
    public void pickup(Station s)
    {
        ArrayList<Passenger> passAtCurrentStation = s.getWaiting();
        int i = passAtCurrentStation.size() - 1;
        while (i >= 0 && passengers.size() < MAX_PASSENGERS)
        {
            if ((passAtCurrentStation.get(i).getDest() > passAtCurrentStation.get(i).getLoc() && 
                 this.dest > this.loc) ||
                (passAtCurrentStation.get(i).getDest() < passAtCurrentStation.get(i).getLoc() && 
                 this.dest < this.loc))
            {
                passengers.add(passAtCurrentStation.get(i));
                s.removeWaiting(passAtCurrentStation.get(i));
            }
            i--;
        }
    }

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
        result += "],miles=" + miles + "]";
        return result;
    }

}
