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
    
    public int getLoc()
    {
        return loc;
    }

    public int getDest()
    {
        return dest;
    }

    public void setLoc(int newLoc)
    {
        loc = newLoc;
    }

    public String toString()
    {
        return super.toString() + "[loc=" + loc + ",dest=" + dest + "]";
    }

}