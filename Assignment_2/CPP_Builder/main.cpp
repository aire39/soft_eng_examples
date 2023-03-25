#include <iostream>
#include <memory>

#include "PizzaDesc.h"
#include "Pizza.h"
#include "PizzaGenericBuilder.h"
#include "PizzaHutBuilder.h"
#include "DominosBuilder.h"
#include "LittleCaesarsBuilder.h"
#include "PizzaEmployee.h"

int main(int argc, char*argv[])
{
    /*
    auto pizza_store = std::make_unique<PizzaGenericBuilder>();
    auto pizza_store_empl = std::make_unique<PizzaEmployee>(pizza_store.get());

    pizza_store_empl->MakePizza(PizzaSize::LARGE, {PizzaTopping::PEPPORONI, PizzaTopping::HAM_PINE});
    auto pizza_3_topping = pizza_store_empl->GetPizza();
    pizza_3_topping->eat();

    pizza_store_empl->MakePizza(PizzaSize::SMALL, {PizzaTopping::PEPPORONI, PizzaTopping::HAM_PINE, PizzaTopping::TOMATO_BASIL, PizzaTopping::OLIVES});
    auto pizza_6_topping = pizza_store_empl->GetPizza();
    pizza_6_topping->eat();

    pizza_store_empl->MakePizza(PizzaSize::MEDIUM, {PizzaTopping::PEPPORONI, PizzaTopping::HAM_PINE, PizzaTopping::TOMATO_BASIL, PizzaTopping::MUSHROOMS, PizzaTopping::OLIVES, PizzaTopping::SAUSAGE, PizzaTopping::ONIONS});
    auto pizza_9_topping = pizza_store_empl->GetPizza();
    pizza_9_topping->eat();

    std::cout << std::endl << std::endl;
*/
    auto pizza_hut = std::make_unique<PizzaHutBuilder>();
    auto pizza_hut_empl = std::make_unique<PizzaEmployee>(pizza_hut.get());

    pizza_hut_empl->MakePizza(PizzaSize::LARGE, {PizzaTopping::PEPPORONI, PizzaTopping::HAM_PINE});
    auto pizzahut_pizza_1st_order = pizza_hut_empl->GetPizza();
    pizzahut_pizza_1st_order->eat();

    pizza_hut_empl->MakePizza(PizzaSize::SMALL, {PizzaTopping::BACON, PizzaTopping::BEEF});
    auto pizzahut_pizza_2nd_order = pizza_hut_empl->GetPizza();
    pizzahut_pizza_2nd_order->eat();
/*
    std::cout << std::endl;

    auto caesars = std::make_unique<LittleCaesarsBuilder>();
    auto caesars_empl = std::make_unique<PizzaEmployee>(caesars.get());

    caesars_empl->MakePizza(PizzaSize::SMALL, {PizzaTopping::PEPPORONI, PizzaTopping::HAM_PINE, PizzaTopping::TOMATO_BASIL, PizzaTopping::OLIVES, PizzaTopping::SAUSAGE, PizzaTopping::PESTO});
    auto caesars_pizza_1st_order = caesars_empl->GetPizza();
    caesars_pizza_1st_order->eat();

    caesars_empl->MakePizza(PizzaSize::LARGE, {PizzaTopping::PEPPORONI, PizzaTopping::HAM_PINE, PizzaTopping::TOMATO_BASIL, PizzaTopping::EXTRA_CHEESE});
    auto caesars_pizza_2nd_order = caesars_empl->GetPizza();
    caesars_pizza_2nd_order->eat();

    std::cout << std::endl;

    auto dominos = std::make_unique<DominosBuilder>();
    auto dominos_empl = std::make_unique<PizzaEmployee>(dominos.get());

    dominos_empl->MakePizza(PizzaSize::MEDIUM, {PizzaTopping::PEPPORONI});
    auto dominos_pizza_1st_order = dominos_empl->GetPizza();
    dominos_pizza_1st_order->eat();

    dominos_empl->MakePizza(PizzaSize::MEDIUM, {PizzaTopping::PEPPORONI, PizzaTopping::MUSHROOMS, PizzaTopping::BACON});
    auto dominos_pizza_2nd_order = dominos_empl->GetPizza();
    dominos_pizza_2nd_order->eat();
*/
    return 0;
}