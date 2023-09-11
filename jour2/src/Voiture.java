public class Voiture {

    static int Speed;
    public Voiture(int speed) {
        String Brand = "Toyota";
        String Color = "White";
        Speed = speed;
    }

    static void turn_on() {
        System.out.println("The car is turned on!");
    }

    static void accelerate_10() throws LimitSpeedOverrun {
        Speed = Speed + 10;
        if (Speed > 100) {
            throw new LimitSpeedOverrun();
        }
        System.out.println("The actual speed is now " + Speed + " km/h!");

    }

    static void car_brake() {
        Speed = 0;
        System.out.println("The car brakes, the speed is now down to " + Speed + " km/h...");
    }
}
