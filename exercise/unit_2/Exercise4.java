package exercise.unit_2;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.println(
                name.substring(name.length() - 1, name.length())
                        + name.substring(1, name.length() - 1)
                        + name.substring(0, 1));

        scanner.close();
    }

}