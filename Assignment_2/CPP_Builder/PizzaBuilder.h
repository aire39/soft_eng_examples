#pragma once

#include <memory>
#include <vector>

#include "PizzaDesc.h"
#include "Pizza.h"

class PizzaBuilder
{
    public:
        PizzaBuilder() = default;
        ~PizzaBuilder() = default;

        virtual void MakePizza(PizzaSize size, std::vector<PizzaTopping> toppings) = 0;
        virtual std::unique_ptr<Pizza> GetPizza() = 0;
};
