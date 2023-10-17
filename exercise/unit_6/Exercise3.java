package exercise.unit_6;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        System.out.println(solution(input));

        scanner.close();
    }

    public static long solution(int number) {
        if (number < 0) {
            throw new ArithmeticException();
        }

        if (number == 0) {
            return 1;
        }

        return number * solution(number - 1);
    }
}
