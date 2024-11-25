package az.edu.turing.MediumTasks;

import java.util.Scanner;

public class Task62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long faktorial = scan.nextLong();

        int current =1;
        int num=1;

        while ( current < faktorial) {
            num++;
            current *= num;
        }

        System.out.println(num);
    }
}
