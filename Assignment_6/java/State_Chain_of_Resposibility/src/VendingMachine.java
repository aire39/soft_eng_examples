import java.util.HashMap;

public class VendingMachine {
    private final StateOfVendingMachine vendingMachineState;
    private final HashMap<VendingMachineCell, Snack> snacks;
    private SnackDispenser dispenser;
    private float totalMoney;

    VendingMachine() {
        vendingMachineState = new StateOfVendingMachine();
        snacks = new HashMap<>();
    }

    public void AddSnackToVendingMachine(VendingMachineCell request_area, Snack snack) {
        boolean contain_key = snacks.containsKey(request_area);

        if (!contain_key) {
            snacks.put(request_area, snack);

            if (dispenser == null) {
                dispenser = new SnackDispenser(null);
                dispenser.SetHandlerType(snack, request_area);
            }
            else {
                dispenser = new SnackDispenser(dispenser);
                dispenser.SetHandlerType(snack, request_area);
            }

            System.out.println("Adding " + snack.GetName() + " to vending machine...\nPrice: " + snack.GetPrice() + "\nQuantity: " + snack.GetQuantity() + "\n");
        }
        else {
            Snack snack_in_vending_machine = snacks.get(request_area);
            System.out.println("Snack " + snack_in_vending_machine.GetName() + " already exists at " + request_area);
        }
    }

    public SnackDispenserHandler GetDispenser() {
        return dispenser;
    }

    public void AddMoney(float value) {
        totalMoney += value;
    }

    public void InsertMoney(float amount) {
        vendingMachineState.InsertMoney(this, amount);
    }

    public void ChooseItemByCell(VendingMachineCell request) {
        vendingMachineState.Selection(this, request);
    }

    public void Dispense() {
        vendingMachineState.Dispense(this);
    }

    public void Reset() {
        vendingMachineState.Idle(this);
    }

    public void PrintItemInfoByCell(VendingMachineCell request) {
        boolean contain_key = snacks.containsKey(request);
        if(contain_key) {
            Snack snack_in_vending_machine = snacks.get(request);

            if (snack_in_vending_machine.GetQuantity() > 0) {
                System.out.println("(" + request + ") Snack " + snack_in_vending_machine.GetName() + " with " + snack_in_vending_machine.GetQuantity());
            }
            else {
                System.out.println("No snack item in vending machine cell (" + request + ")!");
            }
        }
        else {
            System.out.println("No snack item in vending machine cell (" + request + ")!");
        }
    }

    public void PrintItemInfoByCell() {
        snacks.forEach((key, value) -> {
            System.out.println("Snack: " + value.GetName());
            System.out.println("Price: " + value.GetPrice());
            System.out.println("Quantity: " + value.GetQuantity());
        });
    }

}
