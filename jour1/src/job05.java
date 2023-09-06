import java.util.Random;
public class job05 {
    public static void main(String[] args) {
        Random R1 = new Random();
        int d1 = R1.nextInt(6)+1;
        int d2 = R1.nextInt(6)+1;
        System.out.println("Two dices will be roll");
        System.out.println("Here is the Dice 1: "+d1);
        System.out.println("Here is the Dice 2: "+d2);
        System.out.println("The score is: "+(d1+d2)+". Nice job!");
    }
}
