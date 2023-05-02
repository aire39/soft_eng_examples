public class Driver {
    public static void main(String[] args) {

        SnickersBar snicker_bar_snack = new SnickersBar();
        VendingMachine vending_machine = new VendingMachine();

        vending_machine.AddSnack(VendingMachineRequests.A0, snicker_bar_snack);
    }
}