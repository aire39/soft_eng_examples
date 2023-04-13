public class DrinkPepsiDecorator extends FoodDecorator {
    DrinkPepsiDecorator(Food food_item) {
        super(food_item);
    }
    @Override
    public void Order() {
        foodItem.Order();

        cost += foodItem.Cost();
        cost += 0.0;

        System.out.println("+ Pepsi Drink");
    }
}
