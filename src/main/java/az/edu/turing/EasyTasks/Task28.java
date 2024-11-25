package az.edu.turing.EasyTasks;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a=0;
        int b=0;
        for (int i = 1 ;i<num ; i++){
            int product =1;
            for (int j = i; j<60; j++){
                product *=j;
                if (product==num){
                    a=i;
                    b=j;
                    break;
                }
            }

        }
        System.out.println(a+" " + b);
    }
}


