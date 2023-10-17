package exercise.unit_6;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        System.out.println(solution(input));

        scanner.close();
    }

    public static boolean solution(int input) {

        for (int i = 2; i < Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }

        return true;
    }
}
