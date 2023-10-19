package exercise.unit_7;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int length = scanner.nextInt();

            double[][] matrix = new double[length][length];
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    matrix[i][j] = (i + 1d) * (j + 1d);
                }
            }
            Exercise3.printMatrix(matrix);
            System.out.println();

            double[] result = matrixSumColumns(matrix);
            for (double d : result) {
                System.out.print(d + " ");
            }
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double[] matrixSumColumns(double[][] matrix) {

        int index = 0;
        double[] result = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            double tmp = 0d;
            for (int j = 0; j < matrix[i].length; j++) {
                tmp += matrix[i][j];
            }

            result[index++] = tmp;
        }

        return result;
    }
}
