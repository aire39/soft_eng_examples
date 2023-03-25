#include "PizzaGenericBuilder.h"

void PizzaGenericBuilder::MakePizza(PizzaSize size, std::vector<PizzaTopping> toppings)
{
    pizza = std::make_unique<Pizza>();

    pizza->SetSize(size);
    pizza->SetPizzaStore("");

    for (const auto & topping : toppings)
    {
        pizza->AddTopping(topping);
    }
}

std::unique_ptr<Pizza> PizzaGenericBuilder::GetPizza()
{
    return std::move(pizza);
}