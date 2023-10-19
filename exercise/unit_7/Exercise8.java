package exercise.unit_7;

public class Exercise8 {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(mystery(array));
    }

    public static int mystery(int[] A) {
        int x = 0;
        for (int i = 0; i < A.length; i++)
            if (A[i] % 2 == 1)
                x++;
        return x;
    }

}
