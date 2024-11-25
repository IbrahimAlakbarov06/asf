package az.edu.turing.MediumTasks;

import java.util.*;

public class Task167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();

        System.out.println(silsile(N));
    }

    private static long silsile(long N) {
        long count = 0;

        for (long i = 0; i <= N; i++) {
            for (long j = i + 1; j <= N; j++) {
                count++;
            }
        }

        return count;
    }
}
