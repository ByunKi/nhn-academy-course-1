package exercise.unit_7;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int length = scanner.nextInt();

            double[] A = new double[length];
            double[] B = new double[length];

            for (int i = 0; i < length; i++) {
                A[i] = Math.random() * 10;
                B[i] = Math.random() * 10;
            }

            for (int i = 0; i < length; i++) {
                System.out.print(A[i] + " ");
            }
            System.out.println();

            for (int i = 0; i < length; i++) {
                System.out.print(B[i] + " ");
            }
            System.out.println();

            System.out.println(eqaulArrays(A, B));
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean eqaulArrays(double[] A, double[] B) {
        for (int i = 0; i < B.length; i++) {
            if (A[i] != B[i]) {
                return false;
            }
        }

        return true;
    }
}
