public class Fries implements Food {
    @Override
    public void Order() {
        System.out.println("Fries");
    }

    @Override
    public float Cost() {
        return 1.0f;
    }
}
