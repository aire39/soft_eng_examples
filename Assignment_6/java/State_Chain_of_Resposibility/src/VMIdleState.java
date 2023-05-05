public class VMIdleState implements VMState {
    @Override
    public void execute(StateOfVendingMachine state_machine, VendingMachine vending_machine) {
        if (state_machine.GetInsertedMoney() > 0) {
            state_machine.SetState(new VMMoneyInsertionState());
            System.out.println("Moving to Money Insertion State");
        }
        else if (state_machine.GetCell() != VendingMachineCell.NONE) {
            state_machine.SetState(new VMSelectionState());
            System.out.println("Moving to Selection State");
        }
        else {
            vending_machine.Reset();
        }
    }
}
