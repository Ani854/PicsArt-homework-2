package homework2;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 8, 12, 34, 25, 77, 64, 72, 100};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
