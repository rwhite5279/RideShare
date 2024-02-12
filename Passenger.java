/**
 * The Passenger class describes a passenger in the RideShare
 * Project with an initial location (updated as the passenger
 * moves) and a final destination.
 */

public class Passenger
{
    private int loc;
    private int dest;
    
    /**
     * Describes the passenger
     * @param loc the initial (or current) location
     * @param dest the final location
     */
    public Passenger(int loc, int dest)
    {
        this.loc = loc;
        this.dest = dest;
    }

    /**
     * Identifies the Station location of the passenger
     * (does not update when passenger is in a car)
     * @return the Station location of the passenger
     */
    public int getLoc()
    {
        return loc;
    }

    /**
     * Identifies the destination Station of the passenger
     * @return the destination Station
     */
    public int getDest()
    {
        return dest;
    }

    /**
     * Establishes a new location for the passenger
     * @param newLoc a new Station location (that the passenger has been dropped off at
     */
    public void setLoc(int newLoc)
    {
        loc = newLoc;
    }

    /**
     * Overrides the toString methos
     * @return a string version describing this passenger
     */
    public String toString()
    {
        return super.toString() + "[loc=" + loc + ",dest=" + dest + "]";
    }
}