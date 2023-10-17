package exercise.unit_6;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        solution(input);

        scanner.close();
    }

    public static void solution(int number) {

        for (int i = 1; i <= number; i++) {

            for (int j = number; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }

            for (int j = i - 2; j >= 0; j--) {
                System.out.print(j + 1);
            }

            System.out.println();
        }
    }
}
