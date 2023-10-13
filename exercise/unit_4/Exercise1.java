package exercise.unit_4;

import java.util.Scanner;

public class Exercise1 {

    public static final double EURO_TO_LIRE_RATIO = 1936.27;

    private Exercise1() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Lire: ");
        int lire = scanner.nextInt();
        double euro = convertLireEuro(lire);

        System.out.println(lire + " ITL → " + euro + " EUR");
        scanner.close();
    }

    public static double convertLireEuro(int x) {
        return x * EURO_TO_LIRE_RATIO;
    }
}