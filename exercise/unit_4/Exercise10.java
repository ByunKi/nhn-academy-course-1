package exercise.unit_4;

import java.util.Scanner;

public class Exercise10 {

    private Exercise10() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a sentence: ");
        String input = scanner.nextLine();

        System.out.println(input);
        System.out.println(lastCharacter(input));

        scanner.close();
    }

    public static char lastCharacter(String s) {
        return s.charAt(s.length() - 1);
    }
}
