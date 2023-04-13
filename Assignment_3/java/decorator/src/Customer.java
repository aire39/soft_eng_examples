import java.util.Vector;

public class Customer {
    private Vector<Food> foodList;
    private final String name;
    CustomerStatus status;
    private float totalCost = 0.0f;
    private float discount = 0.0f;

    Customer(String customer_name, CustomerStatus customer_status) {
        name = customer_name;
        foodList = new Vector<>();
        status = customer_status;
    }

    void AddBurger(Vector<BurgerToppings> toppings) {
        Food burger = new Burger();

        for (BurgerToppings topping : toppings) {
            if (topping == BurgerToppings.CHEESE) {
                burger = new BurgerWithCheeseDecorator(burger);
            }

            if (topping == BurgerToppings.PICKLES) {
                burger = new BurgerWithPicklesDecorator(burger);
            }
        }

        foodList.add(burger);
    }

    void AddDrink(DrinkFlavour flavour) {
        Food drink = new Drink();

        if (flavour == DrinkFlavour.PEPSI) {
            drink = new DrinkPepsiDecorator(drink);
        }

        foodList.add(drink);
    }

    void AddFries(FriesType fries_type) {
        Food fries = new Fries();

        if (fries_type == FriesType.WAFFLE) {
            fries = new FriesWaffleDecorator(fries);
        }

        foodList.add(fries);
    }

    CustomerStatus GetStatus() {
        return status;
    }

    void AddDiscount(float discount) {
        this.discount = discount;
    }

    void Order() {
        for (Food food : foodList) {
            food.Order();
            totalCost += food.Cost();
        }

        System.out.println("\nFood Total Cost for " + name + ": $" + (totalCost-discount) + " (original cost: $" + totalCost + ")");
    }
}
