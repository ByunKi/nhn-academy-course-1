package exercise.unit_5;

import java.util.Scanner;

public class Exercise2 {

    private Exercise2() {

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
        int count = getCount(sides);
        if (count == 0) {
            return "irregular";

        } else if (count == 2) {
            return "symmetric";

        } else {
            return "regular";
        }
    }

    public static int getCount(int[] sides) {
        int result = 0;

        for (int i = 0; i < sides.length; i++) {
            for (int j = 0; j < sides.length; j++) {
                if (i == j) {
                    continue;
                }

                if (sides[i] == sides[j]) {
                    result++;
                }
            }
        }

        return result;
    }
}
