import java.util.*;
public class Etudiant {
    static String name = "Boblennon";
    static ArrayList<Float> marks = new ArrayList<Float>();
    public static void main(String[] args){
        System.out.println("L'étudiant est: "+name);
        add_mark(14);
        add_mark(8);
        add_mark(17);
        add_mark(3);
        add_mark(15);
        best_mark();
        worse_mark();
        average();
    }
    public static void add_mark(float newmark){
        marks.add(newmark);
    }
    public static void  best_mark(){
        System.out.println("The student's best mark is: "+Collections.max(marks));
    }
    public static void  worse_mark(){
        System.out.println("The student's worse mark is: "+Collections.min(marks));
    }
    public static void average(){
        float sum = 0;
        for(int i=0; i<marks.size(); i++){
            sum += marks.get(i);
        }
        System.out.println("The average mark of the student is: "+(sum/marks.size()));
    }
}
