package exercise.unit_5;

import java.util.Scanner;

public class Exercise3 {

    private Exercise3() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sides = new int[3];
        for (int i = 0; i < sides.length; i++) {
            sides[i] = scanner.nextInt();
        }
        System.out.println(typeOfTriangle(sides));

        scanner.close();
    }

    public static String typeOfTriangle(int[] sides) {
        if (sides[0] == sides[1] && sides[0] == sides[2]) {
            return "regular";

        } else if (sides[0] == sides[1] || sides[0] == sides[2] || sides[1] == sides[2]) {
            return "symmetric";

        } else {
            return "irregular";
        }
    }
}
