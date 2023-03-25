#pragma once

#include "Car.h"

class HondaCRV : public Car
{
    public:
        HondaCRV()
        {
            make = "Honda";
            model = "CRV";
        }

        std::string GetVehicleName() override
        {
            return model;
        }
};
