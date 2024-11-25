package az.edu.turing.EasyTasks;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();

        int counter =0;
        while (!palindromeNumber(m)){
            int reversed = reversedNumber(m);
            m+=reversed;
            counter++;
        }
        System.out.println(counter);


    }
    public static boolean palindromeNumber(int num){
        int n=num;
        int reversed =0;
        while (num>0){
            reversed=reversed*10+num%10;
            num/=10;
        }

        return reversed==n;
    }
    public static int reversedNumber(int num){
        int reversed =0;
        while (num>0){
            reversed=reversed*10+num%10;
            num/=10;
        }
        return reversed;
    }


}
