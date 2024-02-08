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
 
    public void pickUp(Passenger pass)
    {
        if (passengers.size() < MAX_PASSENGERS)
        {
            
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
        result += "]]";
        return result;
    }

}