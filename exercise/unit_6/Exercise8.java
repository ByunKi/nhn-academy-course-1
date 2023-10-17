package exercise.unit_6;

public class Exercise8 {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "  ");
            }
            System.out.println();
        }

    }
}
