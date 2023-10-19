package exercise.unit_7;

public class Exercise10 {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 2, 1, 2 },
                { 3, 2, 1 },
        };

        int[][] matrix2 = {
                { 1, 2, 3 },
                { 0, 1, 2 },
                { 0, 0, 1 },
        };

        System.out.println(lowerTriangular(matrix) ? "하삼각 행렬" : "일반 행렬");
        System.out.println(lowerTriangular(matrix2) ? "하삼각 행렬" : "일반 행렬");
    }

    public static boolean lowerTriangular(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j < i && matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
