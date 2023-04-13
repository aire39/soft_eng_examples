public class BurgerWithPicklesDecorator extends FoodDecorator {

    BurgerWithPicklesDecorator(Food food_item) {
        super(food_item);
    }
    @Override
    public void Order() {
        foodItem.Order();

        cost += foodItem.Cost();
        cost += 0.5;

        System.out.println("+ Add Pickles");
    }
}
