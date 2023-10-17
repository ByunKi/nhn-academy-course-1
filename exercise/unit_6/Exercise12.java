package exercise.unit_6;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        solution(input);

        scanner.close();
    }

    public static void solution(int input) {
        StringBuilder builder = new StringBuilder();

        int count = 0;
        for (int i = 2; i <= Integer.MAX_VALUE; i++) {
            if (!Exercise11.solution(input)) {
                builder.append(i + " ");
                count++;
            }

            if (count == input) {
                break;
            }
        }

        System.out.println(builder.deleteCharAt(builder.length() - 1).toString());
    }
}
