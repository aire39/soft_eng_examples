#include "DominosBuilder.h"

void DominosBuilder::MakePizza(PizzaSize size, std::vector<PizzaTopping> toppings)
{
    pizza = std::make_unique<Pizza>();

    pizza->SetSize(size);
    pizza->SetPizzaStore("Dominos");

    for (const auto & topping : toppings)
    {
        pizza->AddTopping(topping);
    }
}

std::unique_ptr<Pizza> DominosBuilder::GetPizza()
{
    return std::move(pizza);
}