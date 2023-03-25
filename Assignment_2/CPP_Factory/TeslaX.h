#pragma once

#include "Car.h"

class TeslaX : public Car
{
    public:
        TeslaX()
        {
            make = "Tesla";
            model = "Model X";
        }

        std::string GetVehicleName() override
        {
            return model;
        }
};
