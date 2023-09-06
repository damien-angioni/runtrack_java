public class Job02 {
    static String Brand="Toyota";
    static String Color="White";
    static int Speed=0;
    public static void main(String[] args) {
        turn_on();
        accelerate_10();
        accelerate_10();
        car_brake();
    }
    static void turn_on() {
        System.out.println("The car is turned on!");
    }
    static void accelerate_10() {
        Speed=Speed+10;
        System.out.println("The actual speed is now "+Speed+" km/h!");
    }
    static void car_brake() {
        Speed=0;
        System.out.println("The car brakes, the speed is now down to "+Speed+" km/h...");
    }
}
