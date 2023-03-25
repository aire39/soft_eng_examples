#include "PizzaEmployee.h"

PizzaEmployee::PizzaEmployee(PizzaBuilder* pizza_builder) : pizzaBuilder (pizza_builder)
{
}

void PizzaEmployee::MakePizza(PizzaSize size, std::vector<PizzaTopping> toppings)
{
    pizzaBuilder->MakePizza(size, toppings);
}

std::unique_ptr<Pizza> PizzaEmployee::GetPizza()
{
    return std::move(pizzaBuilder->GetPizza());
}
