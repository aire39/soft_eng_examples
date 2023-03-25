#pragma once

#include <memory>
#include <vector>

#include "Pizza.h"
#include "PizzaDesc.h"
#include "PizzaBuilder.h"

class PizzaEmployee
{
    public:
        PizzaEmployee() = default;
        ~PizzaEmployee() = default;

        PizzaEmployee(PizzaBuilder* pizza_builer);
        void MakePizza(PizzaSize size, std::vector<PizzaTopping> toppings);
        std::unique_ptr<Pizza> GetPizza();

    private:
        PizzaBuilder* pizzaBuilder = nullptr;
};
