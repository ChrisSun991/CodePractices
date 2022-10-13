public class FixedDiver {

    public static void main(String[] args ) {
        double numerator = Double.parseDouble(args[0]);
        double denominator = Double.parseDouble(args[1]);

        double divider = numerator/denominator;
        System.out.println(divider);
    }
}
