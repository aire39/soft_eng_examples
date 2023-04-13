public abstract class FoodDecorator implements Food {
    protected Food foodItem;
    protected float cost = 0.0f;

    FoodDecorator(Food food_item) {
        foodItem = food_item;
    }
    @Override
    public void Order() {
        foodItem.Order();
        cost += foodItem.Cost();
    }

    @Override
    public float Cost() {
        return cost;
    }
}
