package az.edu.turing.HardTasks;

import java.util.Scanner;

public interface Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        int reversed = 0;
        while (num != 0) {
            int temp = num % 10;
            reversed = reversed * 10 + temp;
            num /= 10;
        }
        System.out.println(reversed);
    }
}
