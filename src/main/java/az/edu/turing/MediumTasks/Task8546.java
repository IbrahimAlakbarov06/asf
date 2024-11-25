package az.edu.turing.MediumTasks;

import java.util.Scanner;

public class Task8546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= num; i++) {
            sum += 1.0 / (i * (i + 1));
        }
        System.out.printf("%.6f", sum);
    }
}
