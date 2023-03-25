#pragma once

#include <iostream>
#include <array>
#include <string>

enum class PizzaSize : uint32_t {SMALL=0, MEDIUM, LARGE};
enum class PizzaTopping : uint32_t
{
    PEPPORONI=0, PEPPERS, HAM, SAUSAGE
   ,CHICKEN, PESTO, MUSHROOMS, OLIVES
   ,SPICY_PORK, BACON, SPINACH, HAM_PINE
   ,ONIONS, TOMATO_BASIL, EXTRA_CHEESE, BEEF
};

const static std::array<std::string, 3> pizzaSizeNames = {"Small", "Medium", "Large"};
const static std::array<std::string, 16> pizzaToppingNames =
{"Pepporoni", "Peppers", "Ham", "Sausage"
,"Chicken", "Pesto", "Mushrooms", "Olives"
,"Spicy Portk", "Bacon", "Spinach", "Ham and Pinapple"
,"Onions", "Tomato and Basil", "Extra Cheese", "Beef"};

std::ostream& operator<<(std::ostream& os, const PizzaTopping& topping);
std::ostream& operator<<(std::ostream& os, const PizzaSize& size);
