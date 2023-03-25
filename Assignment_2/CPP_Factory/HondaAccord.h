#pragma once

#include "Car.h"

class HondaAccord : public Car
{
    public:
        HondaAccord()
        {
            make = "Honda";
            model = "Accord";
        }

        std::string GetVehicleName() override
        {
            return model;
        }
};
