public class StateOfVendingMachine {
    private VMState currentState;
    private float amount;
    private VendingMachineCell cell;

    StateOfVendingMachine() {
        currentState = new VMIdleState();
    }

    public VMState GetState() {
        return currentState;
    }

    public void SetState(VMState state) {
        this.currentState = state;
    }

    public float GetInsertedMoney() {
        return amount;
    }

    public VendingMachineCell GetCell() {
        return cell;
    }

    public void Idle(VendingMachine vending_machine) {
        this.amount = 0.0f;
        this.cell = VendingMachineCell.NONE;
        currentState = new VMIdleState();
        currentState.execute(this, vending_machine);
    }

    public void InsertMoney(VendingMachine vending_machine, float amount) {
        this.amount = amount;
        System.out.println("Inserted Money: " + this.amount);
        currentState.execute(this, vending_machine);
    }

    public void Selection(VendingMachine vending_machine, VendingMachineCell cell) {
        this.cell = cell;
        currentState.execute(this, vending_machine);
    }

    public void Dispense(VendingMachine vending_machine) {
        currentState.execute(this, vending_machine);
    }
}
