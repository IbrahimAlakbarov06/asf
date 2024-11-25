package az.edu.turing.EasyTasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();
        int k = scan.nextInt();
        double a = m/n;
        System.out.printf(".%" + k + "f", a);

    }
}
