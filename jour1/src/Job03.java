import java.util.*;

public class Job03 {
    public static void main(String[] args) {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Type the first number: ");
            String input_1= sc1.nextLine();
            Scanner sc2 = new Scanner(System.in);
            System.out.print("Type the second number: ");
            String input_2= sc2.nextLine();
        float nb_1= Float.parseFloat(input_1);
        float nb_2= Float.parseFloat(input_2);

        System.out.println(nb_1+"+"+nb_2+"="+(nb_1+nb_2));
        System.out.println(nb_1+"-"+nb_2+"="+(nb_1-nb_2));
        System.out.println(nb_1+"x"+nb_2+"="+(nb_1*nb_2));
        System.out.println(nb_1+":"+nb_2+"="+(nb_1/nb_2));
        }
    }