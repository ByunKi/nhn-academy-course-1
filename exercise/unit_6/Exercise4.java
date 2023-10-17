package exercise.unit_6;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] inputs = new int[length];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = scanner.nextInt();
        }
        System.out.println(solution(length, inputs));

        scanner.close();
    }

    public static int solution(int length, int[] numbers) {
        int result = 0;

        for (int i = 0; i < length; i++) {
            result += numbers[i];
        }

        return result;
    }
}
