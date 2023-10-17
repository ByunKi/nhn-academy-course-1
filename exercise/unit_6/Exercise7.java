package exercise.unit_6;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        System.out.println(solution(input[0], input[1].charAt(0)));

        scanner.close();
    }

    public static int solution(String str, char ch) {
        int count = 0;
        int index = 0;
        int result = 0;
        int max = Integer.MIN_VALUE;

        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {

            if (array[i] == ch) {
                count++;

                if (i == 0 || (i > 0 && array[i - 1] != array[i])) {
                    index = i;
                }

            } else {
                if (count > max) {
                    max = count;
                    result = index;
                    count = 0;
                }
            }
        }

        if (count > max) {
            result = index;
        }

        return count == 0 ? -1 : result;
    }
}
