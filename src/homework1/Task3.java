package homework1;

public class Task3 {
    public static void main(String[] args) {
        int a = -20;
        int b = 20;
        int count = 0;
        for (int i = a; i < b; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        int j = 0;
        for (int i = a; i < b; i++) {
            if (i % 2 != 0) {
                arr[j] = i;
                j++;
            }
        }
    }
}
