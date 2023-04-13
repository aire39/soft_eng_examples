public class Burger implements Food {
    @Override
    public void Order() {
        System.out.println("Burger");
    }

    @Override
    public float Cost() {
        return 2.0f;
    }
}
