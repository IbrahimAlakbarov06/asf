package az.edu.turing.HardTasks;

import java.util.Scanner;

public class Task1 {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = scan.nextInt();
        int arr[] = new int[n];


        for (int i = 0; i< arr.length; i++){
            System.out.print("Enter "+ i+1 +". element of array: ");
            arr[i]= scan.nextInt();
        }

        System.out.print("Enter target: ");
        int target = scan.nextInt();

        int [] result = twoSum(arr, target);
        if (result[0] == -1 && result[1] ==-1){
            System.out.println("Error");
        }else {
            System.out.println("["+result[0] + "," + result[1] + "]");
        }





    }
}
