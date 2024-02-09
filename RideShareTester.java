
public class RideShareTester
{
    public static void main(String[] args)
    {
        System.out.println("Testing RideShare Pickup/Dropoff!");

        // Creating stations
        final int NUM_OF_STATIONS = 3;
        Station[] stations = new Station[NUM_OF_STATIONS];
        for (int i = 0; i < stations.length; i++)
            stations[i] = new Station();

        // Creating people (specifically for this test)
        stations[0].addWaiting(new Passenger(0, 2));
        stations[1].addWaiting(new Passenger(1, 2));
        stations[1].addWaiting(new Passenger(1, 0));

        for (Station s : stations)
        {
            System.out.println(s);
        } 


    }
}
