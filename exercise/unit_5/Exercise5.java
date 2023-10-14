package exercise.unit_5;

import java.util.Scanner;

public class Exercise5 {

    private Exercise5() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputs = new int[3];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = scanner.nextInt();
        }
        solution(inputs);

        scanner.close();
    }

    public static void solution(int[] numbers) {
        int pivot = distinguish(numbers);

        if (pivot == 1) {
            System.out.println(-numbers[1] / 2 * numbers[0]);

        } else if (pivot == 2) {
            System.out.println((-numbers[1] + Math.sqrt(Math.pow(numbers[1], 2) - 4d * numbers[0] * numbers[2])) / 2d);
            System.out.println((-numbers[1] - Math.sqrt(Math.pow(numbers[1], 2) - 4d * numbers[0] * numbers[2])) / 2d);
        } else {
            System.out.println("Solution did not founded");
        }

    }

    public static int distinguish(int[] numbers) {
        double expression = Math.pow(numbers[1], 2) - (4d * numbers[0] * numbers[2]);

        if (expression > 0) {
            return 2;

        } else if (expression == 0) {
            return 1;

        } else {
            return 0;
        }
    }
}
