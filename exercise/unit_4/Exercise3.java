package exercise.unit_4;

import java.util.Scanner;

public class Exercise3 {

    private Exercise3() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input two Integers split with blank: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("Arithmatic: " + getArithmaticMean(x, y));
        System.out.println("Geometric: " + getGeometricMean(x, y));

        scanner.close();
    }

    public static double getArithmaticMean(int x, int y) {
        return (x + y) / 2d;
    }

    public static double getGeometricMean(int x, int y) {
        return Math.sqrt((x * y));
    }
}
