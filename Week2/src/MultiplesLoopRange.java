public class MultiplesLoopRange {
    public static void main (String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        int fractor = Integer.parseInt(args[2]);

        if (start < end) {
            for (int count = start; count <= end; count++) {
                if (count%fractor == 0){
                    System.out.print(count + " ");
                }
            }
        }
        else if (start > end) {
            for (int count = start; count >= end; count--) {
                if (count%fractor == 0) {
                    System.out.print(count + " ");
                }
            }
        }
        else if(start == end) {
            if (start%fractor == 0){
                System.out.print(start);
            }
            else{
                System.out.print("No values");
            }
        }
        else{
            System.out.print("No Values");
        }

    }
}
