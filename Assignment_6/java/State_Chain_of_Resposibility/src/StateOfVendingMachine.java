public class StateOfVendingMachine {
    private VMState state = new VMIdleState();

    public VMState GetState() {
        return state;
    }

    public void MoveToState(VMState state) {
        this.state = state;
        this.state.execute();
    }
}
