
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
        final int NUM_OF_PEOPLE = 3;
        stations[0].addWaiting(new Passenger(0, 2));
        stations[1].addWaiting(new Passenger(1, 2));
        stations[1].addWaiting(new Passenger(1, 0));

        // Creating cars (specifically for this test)
        final int NUM_OF_CARS = 3;
        Fleet fleet = new Fleet(3);
        fleet.initCar(0, 0, 2);
        fleet.initCar(1, 0, 1);
        fleet.initCar(2, 2, 0);

        for (Station s : stations)
        {
            System.out.println("\n--------------\n");
            System.out.println(s);
            System.out.println("Cars here:");
            System.out.println("    " + fleet.getCarsAtLoc(s));
        } 


    }
}
