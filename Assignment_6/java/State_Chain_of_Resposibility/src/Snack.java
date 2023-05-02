public abstract class Snack {
    protected String name;
    protected float price;
    protected int quantity;

    Snack() {
        SetupSnack();
    }

    protected abstract void SetupSnack();

    public String GetName() {
        return name;
    }

    public float GetPrice() {
        return price;
    }

    public int GetQuantity() {
        return quantity;
    }

    public int RetrieveSnack() {
        quantity -= 1;
        return GetQuantity();
    }

    public void SetQuantity(int amount) {
        quantity = amount;
    }
}
