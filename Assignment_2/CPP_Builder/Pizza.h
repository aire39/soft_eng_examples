#pragma once

#include <vector>
#include <string>
#include <cstdint>
#include <iostream>

#include "PizzaDesc.h"

class Pizza
{
    public:
        Pizza() = default;
        ~Pizza() = default;

        void AddTopping(PizzaTopping topping);
        void SetSize(PizzaSize size);
        void SetPizzaStore(std::string pizza_store);

        void eat();

    private:
        std::string storeName = "Unnamed Store";
        std::vector<PizzaTopping> toppings;
        PizzaSize size;
};
