package az.edu.turing.MediumTasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.close();

        int n = 1;
        while (true) {
            int count = counter(n);
            if (count == k) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }

    public static int counter(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}
