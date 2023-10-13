package exercise.unit_4;

public class Exercise8 {

    private Exercise8() {

    }

    public class Account {
        public int bal;

        public Account(int x) {
            bal = x;
        }
    }

    public static void method(int a, Account b) {
        a *= 2;
        b.bal *= 2;
    }

    public static void main(String[] args) {
        int c = 100;
        Account r = new Exercise8().new Account(100);
        method(c, r);
        System.out.println(c + " " + r.bal);
    }

}
