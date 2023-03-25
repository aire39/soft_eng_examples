import java.util.Vector;


class DominosBuilder implements PizzaBuilder
{
    private Pizza pizza;

    @Override
    public void MakePizza(PizzaSize size, Vector<PizzaTopping> toppings) {
        pizza = new Pizza();

        pizza.SetSize(size);
        pizza.SetPizzaStore("Dominos");
    
        for (PizzaTopping topping : toppings)
        {
            pizza.AddTopping(topping);
        }
    }

    @Override
    public Pizza GetPizza() {
        Pizza new_pizza = null;
        try {
            new_pizza = (Pizza)pizza.clone();
        }catch(CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return new_pizza;
    }
};
