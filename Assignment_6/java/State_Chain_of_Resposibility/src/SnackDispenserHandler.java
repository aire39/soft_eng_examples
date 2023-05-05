public abstract class SnackDispenserHandler {
    protected SnackDispenserHandler next;
    protected VendingMachineCell requestValue;
    protected Snack snack;

    SnackDispenserHandler() {
        this.next = null;
    }

    SnackDispenserHandler(SnackDispenserHandler next) {
        this.next = next;
    }

    SnackDispenserHandler(SnackDispenserHandler next, Snack snack, VendingMachineCell cell) {
        this.next = next;
        this.snack = snack;
        this.requestValue = cell;
    }

    public boolean HandleRequest(VendingMachineCell cell, float amount) {
        boolean found = true;
        if (next != null) {
            next.HandleRequest(cell, amount);
            found = false;
        }

        return found;
    }
}
