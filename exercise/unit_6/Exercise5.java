package exercise.unit_6;

import java.util.Scanner;

public class Exercise5 {

    public static final double INIT = 4d;
    public static final double COMMON_RATIO = 0.5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        System.out.println(solution(input));

        scanner.close();
    }

    public static double solution(int limit) {
        double result = INIT;
        double ratio = COMMON_RATIO;
        int operand = 1;

        for (int i = 0; i < limit; i++) {
            result += (result * operand * ratio);
            operand *= -1;
        }

        return result;
    }
}
