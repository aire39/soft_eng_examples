#include "PizzaHutBuilder.h"

void PizzaHutBuilder::MakePizza(PizzaSize size, std::vector<PizzaTopping> toppings)
{
    pizza = std::make_unique<Pizza>();

    pizza->SetSize(size);
    pizza->SetPizzaStore("Pizza Hut");

    for (const auto & topping : toppings)
    {
        pizza->AddTopping(topping);
    }
}

std::unique_ptr<Pizza> PizzaHutBuilder::GetPizza()
{
    return std::move(pizza);
}