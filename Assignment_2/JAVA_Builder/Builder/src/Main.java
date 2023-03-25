import java.util.Arrays;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        PizzaBuilder pizza_store = new PizzaGenericBuilder();
        PizzaEmployee pizza_store_empl = new PizzaEmployee(pizza_store);

        pizza_store_empl.MakePizza(PizzaSize.LARGE, new Vector<>(Arrays.asList(PizzaTopping.PEPPORONI, PizzaTopping.HAM_PINE)));
        Pizza pizza_3_topping = pizza_store_empl.GetPizza();
        pizza_3_topping.eat();

        pizza_store_empl.MakePizza(PizzaSize.SMALL, new Vector<>(Arrays.asList(PizzaTopping.PEPPORONI, PizzaTopping.HAM_PINE, PizzaTopping.TOMATO_BASIL, PizzaTopping.OLIVES)));
        Pizza pizza_6_topping = pizza_store_empl.GetPizza();
        pizza_6_topping.eat();

        pizza_store_empl.MakePizza(PizzaSize.MEDIUM, new Vector<>(Arrays.asList(PizzaTopping.PEPPORONI, PizzaTopping.HAM_PINE, PizzaTopping.TOMATO_BASIL, PizzaTopping.MUSHROOMS, PizzaTopping.OLIVES, PizzaTopping.SAUSAGE, PizzaTopping.ONIONS)));
        Pizza pizza_9_topping = pizza_store_empl.GetPizza();
        pizza_9_topping.eat();

        System.out.println("");
        System.out.println("");

        PizzaBuilder pizza_hut = new PizzaHutBuilder();
        PizzaEmployee pizza_hut_empl = new PizzaEmployee(pizza_hut);

        pizza_hut_empl.MakePizza(PizzaSize.LARGE, new Vector<PizzaTopping>(Arrays.asList(PizzaTopping.PEPPORONI, PizzaTopping.HAM_PINE)));
        Pizza pizzahut_pizza_1st_order = pizza_hut_empl.GetPizza();
        pizzahut_pizza_1st_order.eat();

        pizza_hut_empl.MakePizza(PizzaSize.SMALL, new Vector<PizzaTopping>(Arrays.asList(PizzaTopping.BACON, PizzaTopping.BEEF)));
        Pizza pizzahut_pizza_2nd_order = pizza_hut_empl.GetPizza();
        pizzahut_pizza_2nd_order.eat();

        System.out.println("");

        PizzaBuilder caesars = new LittleCaesarsBuilder();
        PizzaEmployee caesars_empl = new PizzaEmployee(caesars);

        caesars_empl.MakePizza(PizzaSize.SMALL, new Vector<>(Arrays.asList(PizzaTopping.PEPPORONI, PizzaTopping.HAM_PINE, PizzaTopping.TOMATO_BASIL, PizzaTopping.OLIVES, PizzaTopping.SAUSAGE, PizzaTopping.PESTO)));
        Pizza caesars_pizza_1st_order = caesars_empl.GetPizza();
        caesars_pizza_1st_order.eat();

        caesars_empl.MakePizza(PizzaSize.LARGE, new Vector<>(Arrays.asList(PizzaTopping.PEPPORONI, PizzaTopping.HAM_PINE, PizzaTopping.TOMATO_BASIL, PizzaTopping.EXTRA_CHEESE)));
        Pizza caesars_pizza_2nd_order = caesars_empl.GetPizza();
        caesars_pizza_2nd_order.eat();

        System.out.println("");

        PizzaBuilder dominos = new DominosBuilder();
        PizzaEmployee dominos_empl = new PizzaEmployee(dominos);

        dominos_empl.MakePizza(PizzaSize.MEDIUM, new Vector<>(Arrays.asList(PizzaTopping.PEPPORONI)));
        Pizza dominos_pizza_1st_order = dominos_empl.GetPizza();
        dominos_pizza_1st_order.eat();

        dominos_empl.MakePizza(PizzaSize.MEDIUM, new Vector<>(Arrays.asList(PizzaTopping.PEPPORONI, PizzaTopping.MUSHROOMS, PizzaTopping.BACON)));
        Pizza dominos_pizza_2nd_order = dominos_empl.GetPizza();
        dominos_pizza_2nd_order.eat();
    }
}