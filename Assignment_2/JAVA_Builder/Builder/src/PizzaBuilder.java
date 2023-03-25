import java.util.Vector;

interface PizzaBuilder
{
    void MakePizza(PizzaSize size, Vector<PizzaTopping> toppings);
    Pizza GetPizza();
};
