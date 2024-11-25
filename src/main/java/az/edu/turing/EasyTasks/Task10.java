package az.edu.turing.EasyTasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ağacların sayını daxil edin: ");
        int N = scanner.nextInt();
        int daysNotWatered = 0;

        for (int i = 0; i < N; i++) {
            double waterPerTree = 1.0 / (N - i);
            if (waterPerTree < 0.5) {
                break;
            }
            daysNotWatered++;
        }


        System.out.println("Bağban ağacları " + (N - daysNotWatered) + " gün sulamamışdır.");
    }
}
