package az.edu.turing.HardTasks;

import java.util.Scanner;

public interface Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        int reversed = 0;
        int num2=num;
        while (num != 0) {
            int temp = num % 10;
            reversed = reversed * 10 + temp;
            num /= 10;
        }
        if (reversed==num2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
