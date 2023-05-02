public abstract class SnackDispenserHandler {
    private SnackDispenserHandler next;
    SnackDispenserHandler(SnackDispenserHandler next) {
        this.next = next;
    }

    public void HandleRequest() {

    }
}
