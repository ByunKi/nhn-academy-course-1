package exercise.unit_4;

import java.util.Scanner;

public class Exercise4 {

    private Exercise4() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Integer: ");
        int x = scanner.nextInt();

        System.out.println(even(x) ? "even" : "odd");

        scanner.close();
    }

    public static boolean even(long x) {
        return x % 2 == 0;
    }
}
