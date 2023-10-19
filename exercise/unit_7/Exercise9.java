package exercise.unit_7;

public class Exercise9 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 2, 1, 2 },
                { 3, 2, 1 },
        };

        int[][] matrix2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };

        System.out.println(symmetric(matrix) ? "대칭" : "비대칭");
        System.out.println(symmetric(matrix2) ? "대칭" : "비대칭");
    }

    public static boolean symmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
