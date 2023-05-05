public class Snack {
    protected String snackName;
    protected float snackPrice;
    protected int snackQuantity;

    Snack(String name, float price, int quantity) {
        SetSnack(name, price, quantity);
    }
    private void SetSnack(String name, float price, int quantity) {
        snackName = name;
        snackPrice = price;
        snackQuantity = quantity;
    }

    public String GetName() {
        return snackName;
    }

    public float GetPrice() {
        return snackPrice;
    }

    public int GetQuantity() {
        return snackQuantity;
    }

    public int RetrieveSnack() {
        snackQuantity = Integer.max((snackQuantity-1), 0);
        return GetQuantity();
    }
}
