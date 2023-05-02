import java.util.HashMap;

public class VendingMachine {
    private StateOfVendingMachine vendingMachineState;
    private HashMap<VendingMachineRequests, Snack> snacks;

    VendingMachine() {
        vendingMachineState = new StateOfVendingMachine();
        snacks = new HashMap<>();
    }

    public void AddSnack(VendingMachineRequests request_area, Snack snack) {

        boolean contain_key = snacks.containsKey(request_area);

        if (!contain_key) {
            snacks.put(request_area, snack);

            System.out.println("Adding " + snack.GetName() + " to vending machine...\nPrice: " + snack.GetPrice() + "\nQuantity: " + snack.GetQuantity() + "\n");
        }
        else {
            Snack snack_in_vending_machine = snacks.get(request_area);
            System.out.println("Snack " + snack_in_vending_machine.GetName() + " already exists at " + request_area);
        }
    }

}
