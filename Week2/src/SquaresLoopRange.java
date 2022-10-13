public class SquaresLoopRange {
    public static void main (String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        if (start > end) {
            System.out.println("Start limit greater than end limit");
        }
        else {
            for ( int count = start; count <= end ; count ++ ){
                System.out.print(count * count + " " );
            }
        }
    }
}
