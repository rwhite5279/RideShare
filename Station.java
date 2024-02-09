/**
 *  The Station class describes a location along 
 *  the road where 
 *  a) a non-riding Passenger can wait for a ride, or
 *  b) a riding Passenger can disembark, 
 *     hopefully after arriving at their final 
 *     destination
 */
 
import java.util.ArrayList;

public class Station
{
    ArrayList<Passenger> waiting;
    private int stationNum;
    public static int firstNum = 0;
    
    public Station()
    {
        waiting = new ArrayList<Passenger>();
        stationNum = firstNum;
        firstNum++;
    }

    public int getStationNum()
    {
        return stationNum;
    }

    public void addWaiting(Passenger p)
    {
        waiting.add(p);
    }

    public void removeWaiting(Passenger p)
    {
        waiting.remove(p);
    }

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
