package exercise.unit_4;

public class Exercise2 {

    private Exercise2() {

    }

    public static void main(String[] args) {
        System.out.println(sumOverflow(Byte.MAX_VALUE, Byte.MAX_VALUE));
    }

    public static boolean sumOverflow(Byte x, Byte y) {
        return !(Byte.MIN_VALUE <= (x + y) && (x + y) <= Byte.MAX_VALUE);
    }
}
