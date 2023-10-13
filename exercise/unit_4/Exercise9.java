package exercise.unit_4;

public class Exercise9 {

    private Exercise9() {

    }

    public static void main(String[] args) {
        Product lamp = new Product("Lamp 60 Watt");
        System.out.println("Before the loading: " + lamp);
        lamp.downLoad(1000);
        lamp.upLoad(100);
        System.out.println("After the loading: " + lamp);
    }
}

class Product {
    private String name;
    private int stocks;

    public Product(String name) {
        this.name = name;
        this.stocks = 0;
    }

    private void setStocks(int stocks) {
        this.stocks = stocks;
    }

    public String getName() {
        return name;
    }

    public int getStocks() {
        return stocks;
    }

    private void classInvarient(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public void downLoad(int quantity) {
        int currentStocks = getStocks();
        setStocks(currentStocks + quantity);
    }

    public void upLoad(int quantity) {
        int currentStocks = getStocks();
        classInvarient(currentStocks - quantity);
        setStocks(currentStocks - quantity);
    }

    @Override
    public String toString() {
        return getName() + " " + getStocks();
    }

}