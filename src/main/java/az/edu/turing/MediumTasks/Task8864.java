package az.edu.turing.MediumTasks;

import java.util.Scanner;

public class Task8864 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();

        if (n>0 && m>0 || n<0 && m<0){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
