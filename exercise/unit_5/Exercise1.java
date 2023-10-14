package exercise.unit_5;

import java.util.Scanner;

public class Exercise1 {

    private Exercise1() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input alcohol concentration: ");
        double input = scanner.nextDouble();
        printAlcoholconcentration(input);

        scanner.close();
    }

    public static void printAlcoholconcentration(double g) {
        String result = "";

        if (g <= 10.5) {
            result = "light vine";

        } else if (g <= 12) {
            result = "normal vine";

        } else if (g <= 15) {
            result = "strong vine";

        } else if (g <= 20) {
            result = "liquor";

        } else if (g <= 40) {
            result = "strong liquor";

        } else {
            result = "extra strong liquor";
        }

        System.out.println(result);
    }
}
