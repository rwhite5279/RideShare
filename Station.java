/**
 *  The Station class describes a location along 
 *  the road where 
 *  a) a non-riding Passenger can wait for a ride, or
 *  b) a riding Passenger can disembark, 
 *     hopefully after arriving at their final 
 *     destination
 */
 
import java.util.ArrayList;

/**
 * Describes a Station with a number (an int), and 
 * an empty list of waiting passengers.
 */
public class Station
{
   

    /**
     * Initializes the empty station
     */
    public Station()
    {

    }

    /**
     * Returns the number of the station
     * @return the station number
     */
    public int getStationNum()
    {

    }

    /**
     * Places a passenger on the waiting list here
     * @param p the passenger to be added to this station's waiting list
     */
    public void addWaiting(Passenger p)
    {

        

    }

    /**
     * Removes a passenger from the waiting list here
     * @param p a passenger to be taken off the list (because they're getting in a car)
     */
    public Passenger removeWaiting(Passenger p)
    {
    



    }

    /**
     * Identifies the list of passengers waiting here to be picked up
     * @return the waiting passengers list
     */
    public ArrayList<Passenger> getWaiting()
    {
        return waiting;
    }

    /**
     * Overrides the toString method to provide a summary of the Station's state.
     * @return a string suitable for printing a summary of the Station
     */
    public String toString()
    {
        String result = super.toString();
        result += "[stationNum=" + stationNum;
        result += "\n    waiting=[";
        for (int i = 0; i < waiting.size(); i++)
        {
            if (i >= 1)
                result += ","; 
            result += waiting.get(i);
        }
        result += "]]";
        return result;
    }
}
