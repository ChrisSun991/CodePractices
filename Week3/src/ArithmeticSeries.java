public class ArithmeticSeries {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int i = 0;
        int val = 0;

        while (i <= n){
            val = val + i;
            i++;
        }
        System.out.print(val);
    }
}
