import java.util.Arrays;
public class TempMedian {
    public static void main(String[] args){
        int[] myValues = new int[4];
        myValues[0] = 3;
        myValues[1] = 2;
        myValues[2] = 5;
        myValues[3] = -1;

        Arrays.sort(myValues);
        for (int i = 0; i <= 3; i++) {
            System.out.print(myValues[i] + "  ");
        }
    }
}
