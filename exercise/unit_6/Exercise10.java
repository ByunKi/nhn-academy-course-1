package exercise.unit_6;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        solution(input);

        scanner.close();
    }

    public static void solution(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(Exercise3.solution(i));
        }
    }
}
