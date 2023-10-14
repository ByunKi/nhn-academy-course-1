package exercise.unit_5;

import java.util.Scanner;

public class Exercise6 {

    private Exercise6() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(solution(scanner.nextLine()));

        scanner.close();
    }

    public static String solution(String text) {
        StringBuilder builder = new StringBuilder();
        char first = text.charAt(0);
        char last = text.charAt(text.length() - 1);

        if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
            builder.append("MAYBE").append(" ");
        }

        if (last == 'a' || last == 'i' || last == 'u') {
            builder.append("YES").append(" ");
        }

        if (last == 'e' || last == 'o') {
            builder.append("NO").append(" ");
        }

        if (last != 'a' && last != 'e' && last != 'i' && last != 'o' && last != 'u') {
            builder.append("DON'T KNOW").append(" ");
        }

        return builder.deleteCharAt(builder.length() - 1).toString();
    }
}
