public class LargestDouble {
    public static void main(String[] args){
        double myDouble1 = Double.parseDouble(args[0]);
        double myDouble2 = Double.parseDouble(args[1]);

        double max = Math.max(myDouble1,myDouble2);

        System.out.println( max );
    }
}
