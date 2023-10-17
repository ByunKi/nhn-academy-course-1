package exercise.unit_6;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        solution(input);

        scanner.close();
    }

    public static void solution(int number) {
        int count = 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (i % 2 == 0) {
                builder.append(i).append(" ");
                count++;
            }

            if (count == number) {
                break;
            }
        }

        System.out.println(builder.deleteCharAt(builder.length() - 1).toString());
    }
}
