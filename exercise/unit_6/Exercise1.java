package exercise.unit_6;

import java.util.Scanner;

public class Exercise1 {

    private Exercise1() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputs = new int[10];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = scanner.nextInt();
        }
        System.out.println(min(inputs));

        scanner.close();
    }

    public static int min(int... numbers) {
        int result = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (result > number) {
                result = number;
            }
        }

        return result;
    }
}