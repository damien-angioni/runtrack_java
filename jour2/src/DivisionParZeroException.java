public class DivisionParZeroException {
    public static void main(String[] args) {
        try {
            System.out.println("14:0=" + (14 / 0));
        } catch (ArithmeticException e) {
            System.out.println("division par zéro.");
        }
    }
}

