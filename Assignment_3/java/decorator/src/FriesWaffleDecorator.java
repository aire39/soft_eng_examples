public class FriesWaffleDecorator extends FoodDecorator {
    FriesWaffleDecorator(Food food_item) {
        super(food_item);
    }
    @Override
    public void Order() {
        foodItem.Order();

        cost += foodItem.Cost();
        cost += 0.25;

        System.out.println("+ Waffle Fries");
    }
}
