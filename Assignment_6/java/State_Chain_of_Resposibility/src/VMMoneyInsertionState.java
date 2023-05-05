public class VMMoneyInsertionState implements VMState {
    @Override
    public void execute(StateOfVendingMachine state_machine, VendingMachine vending_machine) {
        if ((state_machine.GetInsertedMoney() > 0) && (state_machine.GetCell() != VendingMachineCell.NONE)) {
            state_machine.SetState(new VMDispenseSnackState());
            System.out.println("Moving to Dispense State");
        }
        else if (state_machine.GetCell() != VendingMachineCell.NONE) {
            state_machine.SetState(new VMSelectionState());
            System.out.println("Moving to Selection State");
        }
        else {
            state_machine.SetState(new VMIdleState());
            System.out.println("Moving to Idle State");
        }
    }
}
