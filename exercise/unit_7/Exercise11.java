package exercise.unit_7;

public class Exercise11 {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 2, 1, 2 },
                { 3, 2, 1 },
        };

        int[][] matrix2 = {
                { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 1 },
        };

        System.out.println(diagonal(matrix) ? "대각 행렬" : "일반 행렬");
        System.out.println(diagonal(matrix2) ? "대각 행렬" : "일반 행렬");
    }

    public static boolean diagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    continue;
                }

                if (matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
