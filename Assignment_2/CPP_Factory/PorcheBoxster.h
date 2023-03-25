#pragma once

#include "Car.h"

class PorcheBoxster : public Car
{
    public:
        PorcheBoxster()
        {
            make = "Porche";
            model = "Boxster";
        }

        std::string GetVehicleName() override
        {
            return model;
        }
};
