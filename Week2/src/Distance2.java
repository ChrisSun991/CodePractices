public class Distance2 {

    public static void main(String[] args) {
        int myNumber1 = Integer.parseInt(args[0]);
        int myNumber2 = Integer.parseInt(args[1]);

        int difference = myNumber1-myNumber2;
        int absDifference = Math.abs(difference);

        System.out.println(" Difference : " + absDifference);
    }
}
