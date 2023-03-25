#include "PizzaDesc.h"
#include <cstdint>

std::ostream& operator<<(std::ostream& os, const PizzaTopping& topping)
{
    return os << pizzaToppingNames[static_cast<uint32_t>(topping)];
}

std::ostream& operator<<(std::ostream& os, const PizzaSize& size)
{
    return os << pizzaSizeNames[static_cast<uint32_t>(size)];
}