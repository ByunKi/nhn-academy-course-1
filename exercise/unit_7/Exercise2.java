package exercise.unit_7;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int length = scanner.nextInt();

            int[] arrayA = new int[length];
            int[] arrayB = new int[length];

            for (int i = 0; i < length; i++) {
                arrayA[i] = i + 1;
                arrayB[i] = i + 3;
            }

            int[] array = Intersection(arrayA, arrayB);
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();

        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * 두 배열의 크기는 동일하다, 중복도 없다.
     * 가장 최악의 경우인 두 배열의 원소들이 전부 겹치는 상황에서 결과로 반환할 배열의 크기는 parameter로 전달된 배열의 크기와
     * 동일하다.
     * 연산 후, 크기를 줄이는 방법도 존재하여 최적화가 가능할 것 같다.
     */
    public static int[] Intersection(int[] A, int[] B) {
        int index = 0;
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    result[index++] = A[i];
                }
            }
        }

        return result;
    }
}
