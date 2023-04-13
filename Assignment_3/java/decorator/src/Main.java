import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Jason", CustomerStatus.PREMIUM);

        Vector<BurgerToppings> burger_1_toppings = new Vector<>();
        burger_1_toppings.add(BurgerToppings.CHEESE);
        burger_1_toppings.add(BurgerToppings.PICKLES);
        customer.AddBurger(burger_1_toppings);

        Vector<BurgerToppings> burger_2_toppings = new Vector<>();
        burger_2_toppings.add(BurgerToppings.CHEESE);
        customer.AddBurger(burger_2_toppings);

        customer.AddDrink(DrinkFlavour.PEPSI);
        customer.AddFries(FriesType.WAFFLE);

        CustomerLoyaltyDiscount.Discount(customer);

        customer.Order();
    }
}
