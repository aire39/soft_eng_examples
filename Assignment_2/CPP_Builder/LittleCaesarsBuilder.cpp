#include "LittleCaesarsBuilder.h"

void LittleCaesarsBuilder::MakePizza(PizzaSize size, std::vector<PizzaTopping> toppings)
{
    pizza = std::make_unique<Pizza>();

    pizza->SetSize(size);
    pizza->SetPizzaStore("Little Caesars");

    for (const auto & topping : toppings)
    {
        pizza->AddTopping(topping);
    }
}

std::unique_ptr<Pizza> LittleCaesarsBuilder::GetPizza()
{
    return std::move(pizza);
}