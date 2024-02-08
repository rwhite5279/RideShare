public class RideShareTester
{
    public static void main(String[] args)
    {
        System.out.println("Testing RideShare!");
        /* 
        // First test
        Car c1 = new Car(1, 5);
        Passenger p1 = new Passenger(1, 3);
        System.out.println(c1);
        c1.pickup(p1);
        System.out.println(c1);
        c1.move();
        c1.dropoff();
        c1.move();
        c1.dropoff();
        System.out.println(c1);
        */

        // Second test
        Passenger p1 = new Passenger(1, 3);
        Station s1 = new Station();
        s1.addWaiting(p1);
        System.out.println(p1);
        System.out.println(s1);
        s1.removeWaiting(p1);
        System.out.println(s1);


    }
}
