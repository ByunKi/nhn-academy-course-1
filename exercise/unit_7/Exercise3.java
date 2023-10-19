package exercise.unit_7;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int length = scanner.nextInt();

            double[][] matrix = new double[length][length];
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    matrix[i][j] = (i + 1d) * j;
                }
            }
            printMatrix(matrix);
            System.out.println();

            double[][] result = transposeMatrix(matrix);
            printMatrix(result);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double[][] transposeMatrix(double[][] matrix) {
        double[][] result = new double[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = matrix[j][i];
            }
        }

        return result;
    }

    public static void printMatrix(double[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
