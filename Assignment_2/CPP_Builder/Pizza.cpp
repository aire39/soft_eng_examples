#include "Pizza.h"

void Pizza::AddTopping(PizzaTopping topping)
{
    toppings.push_back(topping);
}

void Pizza::SetSize(PizzaSize size)
{
    this->size = size;
}

void Pizza::SetPizzaStore(std::string store_name)
{
    storeName = store_name;
}

void Pizza::eat()
{
    std::cout << "Ate " << size << " ";
    for (const auto& topping : toppings)
    {
        std::cout << topping << ", ";
    }

    if (!storeName.empty())
    {
        std::cout << "from " << storeName << std::endl;
    }
    else
    {
        std::cout << std::endl;
    }
}
