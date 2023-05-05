public class VMDispenseSnackState implements VMState {
    @Override
    public void execute(StateOfVendingMachine state_machine, VendingMachine vending_machine) {
        if (vending_machine.GetDispenser().HandleRequest(state_machine.GetCell(), state_machine.GetInsertedMoney())) {
            vending_machine.AddMoney(state_machine.GetInsertedMoney());
        }

        state_machine.SetState(new VMIdleState());
    }
}
