#pragma once

#include <memory>
#include <vector>

#include "PizzaBuilder.h"
#include "PizzaDesc.h"
#include "Pizza.h"

class DominosBuilder : public PizzaBuilder
{
    private:
    std::unique_ptr<Pizza> pizza;

    public:
        DominosBuilder() = default;
        ~DominosBuilder() = default;

        void MakePizza(PizzaSize size, std::vector<PizzaTopping> toppings) override;
        std::unique_ptr<Pizza> GetPizza() override;
};
