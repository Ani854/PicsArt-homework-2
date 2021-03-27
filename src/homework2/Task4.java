package homework2;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 34, 25, 10, 64, 55};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
