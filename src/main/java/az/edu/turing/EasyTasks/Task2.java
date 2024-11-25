package az.edu.turing.EasyTasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int digitCount = String.valueOf(n).length();
        System.out.println(digitCount);
    }
}
