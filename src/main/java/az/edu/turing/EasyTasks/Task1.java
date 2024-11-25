package az.edu.turing.EasyTasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int a =scan.nextInt();
        if (a>9 && a<100) {
            System.out.println(a/10);
            System.out.println(a%10);
        } else {
            System.out.println("Not avaible number");
        }
    }
}