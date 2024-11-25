package az.edu.turing.EasyTasks;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int counter =0 ;

        for (int i =a;i< b; i++){
            if (primeNumber(i)){
                int reversed = reversedNumber(i);
                if (primeNumber(reversed)){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
    public static boolean primeNumber(int num){
        if (num<2){
            return false;
        }
        for (int i =2; i< num; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    public static int reversedNumber(int num){
        int reversed =0;
        while (num>0){
            reversed =reversed *10 +num%10;
            num/=10;
        }
        return reversed;
    }

}
