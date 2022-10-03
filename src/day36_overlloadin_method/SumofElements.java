package day36_overlloadin_method;

public class SumofElements {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2};
        System.out.println("Normal: " + sum(arr));

        System.out.println("Nrml with String: "+ sum(arr,"hello"));

        System.out.println("Traditional: " + sum(4, 6, 2, 6, 12, 4));
    }

    // traditiona version
    public static int sum(int... nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        return sum;

        // normal version
    }


    public static int sum(int [] nums, String size) {
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        return sum;

    }
}
