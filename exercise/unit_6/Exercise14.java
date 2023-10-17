package exercise.unit_6;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        System.out.println(solution(input));

        scanner.close();
    }

    public static String solution(int input) {
        StringBuilder builder = new StringBuilder();

        for (int i = 2; i <= input; i++) {
            if (Exercise11.solution(i) && input % i == 0) {
                builder.append(i + " ");
                input /= (i--);
                continue;
            }
        }

        return builder.deleteCharAt(builder.length() - 1).toString();
    }

}
