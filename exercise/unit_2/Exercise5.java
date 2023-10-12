package exercise.unit_2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        /* StringBuffer → StringBuilder */
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String name = scanner.nextLine();

        StringBuilder builder = new StringBuilder();
        builder.append(name.substring(name.length() - 1, name.length()));
        builder.append(name.substring(1, name.length() - 1));
        builder.append(name.substring(0, 1));
        System.out.println(builder.toString());

        scanner.close();
    }
}
