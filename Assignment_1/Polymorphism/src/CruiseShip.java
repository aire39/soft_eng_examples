public class CruiseShip extends Ship {

    private int maxPassengers = 0;

    CruiseShip() {
        super();
    }

    CruiseShip(String name, int year, int max_passengers) {
        super(name, year);
        maxPassengers = max_passengers;
    }

    @Override
    public void print() {
        System.out.print("Ship: " + name + " Year: " + year + " Max Passengers: " + maxPassengers + "\n");
    }
}
