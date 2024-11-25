package az.edu.turing.MediumTasks;

import java.util.Scanner;

public class Task1{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();

        long matches = 12*a-4*(a-1);

        System.out.println(matches);
    }
}
