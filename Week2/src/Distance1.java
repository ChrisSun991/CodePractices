public class Distance1 {

    public static void main(String[] args) {

        int myNumber1 = Integer.parseInt(args[0]);
        int myNumber2 = Integer.parseInt(args[1]);

        int max = Math.max(myNumber1,myNumber2);
        int min = Math.min(myNumber1,myNumber2);

        int difference = max - min;

        System.out.println("Difference : " + difference);

    }
}
