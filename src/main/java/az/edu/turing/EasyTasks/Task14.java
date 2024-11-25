package az.edu.turing.EasyTasks;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int ticketNum= scan.nextInt();
        if (!primeNum(ticketNum)){
            System.out.println("-1");
            return;
        }
        int count =0;
        while (num>0){
            if (primeNum(ticketNum)){
                System.out.println(count);
                return;
            }
            ticketNum++;
            count++;
            num--;
        }
        System.out.println("-1");
    }
    public static boolean primeNum(int ticket ){
        if (ticket < 2){
            return false;
        }
        for (int i = 2; i<=ticket; i++){
            if (ticket % i ==0){
                return false;
            }
        }
        return true;
    }
}
