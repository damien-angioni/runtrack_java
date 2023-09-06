import java.util.Scanner;

public class CompteBancaire {
    static float balance = 28000;
    public static void main(String[] args){
        see_balance();
        deposit();
        see_balance();
        withdraw();
        see_balance();
        withdraw();
        see_balance();
    }
    static void see_balance(){
        System.out.println("Your balance is: "+balance+"¥");
    }
    static void deposit(){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("How much want you deposit?: ");
        String input= sc1.nextLine();
        float nb= Float.parseFloat(input);
        balance=balance+nb;
        System.out.println("Your current balance is now: "+balance+"¥");
    }
    static void withdraw(){
        Scanner sc2 = new Scanner(System.in);
        System.out.print("How much want you withdraw?: ");
        String input= sc2.nextLine();
        float nb= Float.parseFloat(input);
        if (nb>balance){
            System.out.println("We cannot afford to let you withdraw an amount that you do not have...");
        }
        else {
            balance = balance - nb;
            System.out.println("Your current balance is now: " + balance + "¥");
        }
    }
}
