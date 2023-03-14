public class CargoShip extends Ship {
    private int cargoCapacityInTons = 0;

    CargoShip() {
        super();
    }

    CargoShip(String name, int year, int cargo_capacity_in_tons) {
        super(name, year);
        cargoCapacityInTons = cargo_capacity_in_tons;
    }

    @Override
    public void print() {
        System.out.print("Ship: " + name + " Year: " + year + " Cargo Capacity (Tons): " + cargoCapacityInTons + "\n");
    }
}
