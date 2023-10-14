package exercise.unit_5;

import java.util.Arrays;

public class Exercise4 {

    private Exercise4() {

    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 9, 9);
        System.out.println(triangle);
    }
}

class Triangle {
    private int[] sides;

    public Triangle(int a, int b, int c) {
        this.sides = new int[3];
        sides[0] = a;
        sides[1] = b;
        sides[2] = c;
        sort();
    }

    private void sort() {
        Arrays.sort(this.sides);
    }

    public int getShortest() {
        return sides[0];
    }

    public int getMiddle() {
        return sides[1];
    }

    public int getLongest() {
        return sides[2];
    }

    public boolean isValid() {
        return getLongest() < getShortest() + getMiddle();
    }

    public double getArea() {
        double halfRound = getRound() / 2d;
        return Math.sqrt(halfRound * (halfRound - sides[0]) * (halfRound - sides[1]) * (halfRound - sides[2]));
    }

    public int getRound() {
        return sum();
    }

    public int sum() {
        int result = 0;
        for (int side : this.sides) {
            result += side;
        }

        return result;
    }

    public String getType() {
        return Exercise3.typeOfTriangle(sides);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Condition of Triangle: " + isValid()).append("\n");
        builder.append("Type of Triangle: " + getType()).append("\n");

        builder.append("------------------- sides --------------------").append("\n");
        builder.append("Longest side: " + getLongest()).append("\n");
        builder.append("Middle side: " + getMiddle()).append("\n");
        builder.append("Shortest side: " + getShortest()).append("\n");

        builder.append("------------------- results --------------------").append("\n");
        builder.append("Round of Triangle: " + getRound()).append("\n");
        builder.append("Area of Triangle: " + getArea());
        return builder.toString();
    }

}
