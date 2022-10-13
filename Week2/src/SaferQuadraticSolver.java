public class SaferQuadraticSolver {
    public static void main(String[] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double inequation = b*b-4*a*c;
        boolean inequationBool = inequation >= 0;
        if (a == 0) {
            System.out.println("Equation not solvable");
        }
        else {
            if (inequationBool == true) {
                double x_positive = (-b + Math.sqrt(inequation) / 2 * a);
                double x_negative = (-b - Math.sqrt(inequation) / 2 * a);

                System.out.println(x_positive);
                System.out.println(x_negative);
            } else {
                System.out.println("Imaginary numbers involved");
            }
        }
    }
}
