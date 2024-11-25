package az.edu.turing.EasyTasks;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int length =  str.length();
        int counterOfSymmetry = 0;

        for (int i = 0; i< length/2; i++) {
            if (str.charAt(i)==str.charAt(length-i-1)){
                counterOfSymmetry++;
            }
        }
        System.out.println(counterOfSymmetry);
    }
}
