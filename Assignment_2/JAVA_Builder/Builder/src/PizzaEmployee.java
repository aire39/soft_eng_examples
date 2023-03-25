import java.util.Vector;

class PizzaEmployee {
    private PizzaBuilder pizzaBuilder = null;

    PizzaEmployee(PizzaBuilder pizza_builder) {
        pizzaBuilder = pizza_builder;
    }

    public void MakePizza(PizzaSize size, Vector<PizzaTopping> toppings) {
        pizzaBuilder.MakePizza(size, toppings);
    }

    public Pizza GetPizza() {
        return pizzaBuilder.GetPizza();
    }
};
