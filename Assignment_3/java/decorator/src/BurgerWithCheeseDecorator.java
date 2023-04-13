public class BurgerWithCheeseDecorator extends FoodDecorator {
    BurgerWithCheeseDecorator(Food food_item) {
        super(food_item);
    }
    @Override
    public void Order() {
        foodItem.Order();

        cost += foodItem.Cost();
        cost += 1.0;

        System.out.println("+ Add Cheese");
    }
}
