public class Adder {

    public static void main( String[] args) {
        int myNumber1 = Integer.parseInt(args[0]);
        int myNumber2 = Integer.parseInt(args[1]);

        int sum = myNumber1 + myNumber2;

        System.out.println(myNumber1 + "+" + myNumber2 + "=" + sum);
        System.out.println(sum);
    }
}
