package homework2;

public class Task5 {
    public static void main(String[] args) {
        double[] arr = {12.5, 1, 25, 278.6, 123, 456.7, 777.1, 564, 789, 4};
        double minInt = 24.12;
        double maxInt = 467.23;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > minInt && arr[i] < maxInt) {
                System.out.println(arr[i]);
            }
        }
    }
}
