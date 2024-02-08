public class RideShareTester
{
    public static void main(String[] args)
    {
        System.out.println("Testing RideShare!");
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
    }
}
