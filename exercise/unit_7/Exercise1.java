package exercise.unit_7;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int length = scanner.nextInt();

            double[] arrayA = new double[length];
            double[] arrayB = new double[length];

            for (int i = 0; i < length; i++) {
                arrayA[i] = i + 1d;
                arrayB[i] = i + 1d;
            }

            System.out.println(scalarProduct(arrayA, arrayB));
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double scalarProduct(double[] arrayA, double[] arrayB) {
        double result = 0d;
        for (int i = 0; i < arrayB.length; i++) {
            result += arrayA[i] * arrayB[i];
        }

        return result;
    }
}