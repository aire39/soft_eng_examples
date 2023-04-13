public class Drink implements Food {
    @Override
    public void Order() {
        System.out.println("Drink");
    }

    @Override
    public float Cost() {
        return 1.25f;
    }
}
