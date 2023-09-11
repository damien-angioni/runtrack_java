public class Job05 {
    public static void main(String[] args) {
        Voiture toyota = null;
        if (args != null && args.length == 1) {
            try {
                toyota = new Voiture(Integer.parseInt(args[0]));
            } catch (NumberFormatException e) {
                System.out.println("Arguments invalides.");
                System.exit(1);
            } catch (LimitSpeedOverrun e) {
                System.out.println(e.getMessage());
                System.exit(1);
            }
        } else {
            System.out.println("Arguments invalides.");
            System.exit(1);
        }

    }

}
