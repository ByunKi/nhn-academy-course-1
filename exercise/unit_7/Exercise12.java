package exercise.unit_7;

public class Exercise12 {
    public static void main(String[] args) {
        Apartment apartment = new Apartment(24, "광주광역시 동구 서석동 조선대길 146");
        apartment.moveIn("Abdullah");
        apartment.moveIn("Benjamin");
        apartment.moveIn("Carol");
        apartment.moveIn("Collin");
        apartment.moveIn("David");
        apartment.moveIn("Edgar");
        apartment.moveIn("Frank");
        apartment.moveIn("Gordon");
        apartment.moveIn("Haaland");
        apartment.moveIn("Ingrid");
        System.out.println(apartment);

        apartment.moveOut(3);
        System.out.println(apartment);

        System.out.println(apartment.getTenantName(5));
    }
}

class Apartment {
    private int size;
    private int floor;
    private int maxFloor;
    private String address;
    private String[] residents;

    public Apartment(int size, String address, int maxFloor) {
        preCondition(size, address);
        this.size = size;
        this.address = address;
        this.floor = 0;
        this.maxFloor = maxFloor;

        this.residents = new String[maxFloor];
        for (int i = 0; i < residents.length; i++) {
            residents[i] = "";
        }
    }

    public Apartment(int size, String address) {
        this(size, address, 10);
    }

    private void preCondition(int size, String address) {
        if (size <= 0 || address.isEmpty()) {
            throw new IllegalArgumentException();
        }

    }

    public int getSize() {
        return size;
    }

    public String getAddress() {
        return address;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public String getTenantName(int floor) {
        if (floor < 0 || floor >= maxFloor) {
            return null;
        }
        return residents[floor];
    }

    public int getResidentsNumber() {
        int count = 0;
        for (int i = 0; i < residents.length; i++) {
            if (!residents[i].isEmpty()) {
                count++;
            }
        }

        return count;
    }

    public void moveIn(String name) {
        if (this.floor <= 9 || this.residents[floor].isEmpty()) {
            this.residents[floor++] = name;
        }
    }

    public void moveOut(int floor) {
        if (this.floor < 0 || this.floor > this.maxFloor) {
            return;
        }
        this.residents[floor] = "";
        this.floor--;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("             Size: ").append(getSize()).append("평 \n");
        builder.append("          Address: ").append(getAddress()).append("\n");
        builder.append("Number of tenants: ").append(getResidentsNumber()).append("\n");

        return builder.toString();
    }

}
