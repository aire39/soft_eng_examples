#pragma once

#include "Car.h"

class TeslaS : public Car
{
    public:
        TeslaS()
        {
            make = "Tesla";
            model = "Model S";
        }

        std::string GetVehicleName() override
        {
            return model;
        }
};
