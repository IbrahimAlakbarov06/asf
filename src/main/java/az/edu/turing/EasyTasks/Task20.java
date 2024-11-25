package az.edu.turing.EasyTasks;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();

        int counter = 0;

        while (number >= 10) {
            long sumDigits = 0;

            while (number > 0) {
                sumDigits += number % 10;
                number /= 10;
            }
            number -= sumDigits;
            counter++;

        }
    }
}
