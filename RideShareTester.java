
import java.util.ArrayList;

public class RideShareTester
{
    public static void main(String[] args)
    {
        System.out.println("Testing RideShare Pickup/Dropoff!");

        // Creating stations
        final int NUM_OF_STATIONS = 4;
        Station[] stations = new Station[NUM_OF_STATIONS];
        for (int i = 0; i < stations.length; i++)
            stations[i] = new Station();

        // Creating people (specifically for this test)
        final int NUM_OF_PEOPLE = 4;
        stations[0].addWaiting(new Passenger(0, 2));
        stations[1].addWaiting(new Passenger(1, 2));
        stations[1].addWaiting(new Passenger(1, 0));
        stations[3].addWaiting(new Passenger(3, 0));

        // Creating cars (specifically for this test)
        final int NUM_OF_CARS = 4;
        Fleet fleet = new Fleet(4);
        fleet.initCar(0, 2);
        fleet.initCar(0, 1);
        fleet.initCar(2, 0);
        fleet.initCar(3, 1);

        // Display current state of road, station by station
        for (Station s : stations)
        {
            System.out.println("\n--------------\n");
            System.out.println(s);
            System.out.println("Cars here:");
            System.out.println("    " + fleet.getCarsAtLoc(s));
        } 

        for (int turn = 1; turn < NUM_OF_STATIONS + 1; turn++)
        {
            System.out.println("\n============================\n");
            System.out.println("Turn #" + turn);
            // Try the dropoff-pickup-move cycle going not 
            // station by station, but car by car! 
            // At some point, modify so that a car can only
            // do one thing per turn: dropoff, pickup, or drive?
            for (Car car : fleet.getCars())
            {
                // dropoff passengers, if possible
                ArrayList<Passenger> droppedOff = car.removePassengers();
                if (droppedOff != null)
                {
                    for (Passenger p : droppedOff)
                        if (p.getDest() != car.getLoc())    // passenger hasn't arrived yet
                            stations[car.getLoc()].addWaiting(p);
                }

                // pickup passengers, if possible
                ArrayList<Passenger> waiting = stations[car.getLoc()].getWaiting();
                for (int i = waiting.size() - 1; i >= 0; i--)
                {
                    if (car.getPassengerCount() < Car.MAX_PASSENGERS &&
                    (waiting.get(i).getLoc() < waiting.get(i).getDest() && car.getLoc() < car.getDest()) ||
                    (waiting.get(i).getLoc() > waiting.get(i).getDest() && car.getLoc() > car.getDest()))
                    {
                        car.addPassenger(waiting.get(i));
                        waiting.remove(i);
                    }
                }
                // drive, if possible
                car.move();
            }

            // Display current state of road, station by station
            for (Station s : stations)
            {
                System.out.println("\n--------------\n");
                System.out.println(s);
                System.out.println("Cars here:");
                System.out.println("    " + fleet.getCarsAtLoc(s));
            } 
        }
    }
}