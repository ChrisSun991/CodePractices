public class MeanVariance {
    public static void main(String[] args) {
        int n = args.length;
        double[] nums = new double[n];

        for (int i = 0; i < n; i ++){
            nums[i] = Double.parseDouble(args[i]);
        }

        double mean = 0;

        for (int i = 0; i < n; i++){
            mean = mean + nums[i];
        }

        mean = mean/n;

        System.out.println(mean);

        double val = 0;

        for (int i = 0; i < n; i ++) {
            val = val + (nums[i] - mean)*(nums[i] - mean);
        }
        double variance = val/n;

        System.out.print(variance);
    }
}
