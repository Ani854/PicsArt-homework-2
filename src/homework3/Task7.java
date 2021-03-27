package homework3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        boolean isInInterval = false;
        while (!isInInterval){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if (n > 0 && n < 21) {
                isInInterval = true;
                for (int i = 1; i < 11; i++) {
                    int multiple = n * i;
                    System.out.println(n + " x " + i + " = " + multiple);
                }
            } else {
                System.out.println("Please give an input n from 0 to 21");
            }
        }
    }
}
