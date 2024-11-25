package az.edu.turing.HardTasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter roman: ");
        String roman = scan.nextLine();

        int result = romanToInt(roman);
        System.out.print("Integer value of roman: " + result);

    }
    public static int romanToInt(String roman) {
        int result = 0;
        int value = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int current = 0;

            switch (roman.charAt(i)) {
                case 'I': current = 1; break;
                case 'V': current = 5; break;
                case 'X': current = 10; break;
                case 'L': current = 50; break;
                case 'C': current = 100; break;
                case 'D': current = 500; break;
                case 'M': current = 1000; break;
            }

            if (current < value) {
                result -= current;
            } else {
                result += current;
            }

            value = current;
        }

        return result;
    }
}
