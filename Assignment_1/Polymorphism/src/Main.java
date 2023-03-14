import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Ship> ships = new Vector<>();
        ships.add(new Ship("Basic Ship", 2023));
        ships.add(new CruiseShip("Cruise Ship", 2011, 1000));
        ships.add(new CargoShip("Cargo Ship", 2005, 50));

        for (Ship s : ships) {
            s.print();
        }
    }
}