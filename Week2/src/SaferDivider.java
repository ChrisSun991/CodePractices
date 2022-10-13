public class SaferDivider {

    public static void main(String[] args){
        double numerator = Double.parseDouble(args[0]);
        double denominator = Double.parseDouble(args[1]);

        if (denominator == 0 ) {
            System.out.println("Value is infinity");
        }
        else {
            double value = numerator/denominator;
            System.out.println(value);
        }
    }
}
