package az.edu.turing.MediumTasks;

import java.util.Scanner;

public class Task8894 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n % 2 == 0 && n > 0 || n % 2 == 1 && n < 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
