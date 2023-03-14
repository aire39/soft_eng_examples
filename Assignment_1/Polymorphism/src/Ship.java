public class Ship {
    protected String name = "none";
    protected int year = 0;

    Ship() {}

    Ship(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void print() {
        System.out.print("Ship: " + name + " Year: " + year + "\n");
    }
}
