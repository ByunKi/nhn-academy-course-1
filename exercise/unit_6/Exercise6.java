package exercise.unit_6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int code = scanner.nextInt();
        System.out.println(solution(input, code));

        scanner.close();
    }

    public static String solution(String str, int code) {
        StringBuilder builder = new StringBuilder();

        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            builder.append((char) (array[i] - code));
        }

        return builder.toString();
    }
}
