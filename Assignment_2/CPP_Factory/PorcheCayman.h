#pragma once

#include "Car.h"

class PorcheCayman : public Car
{
    public:
        PorcheCayman()
        {
            make = "Porche";
            model = "Cayman";
        }

        std::string GetVehicleName() override
        {
            return model;
        }
};
