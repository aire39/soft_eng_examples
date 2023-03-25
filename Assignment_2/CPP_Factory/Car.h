#pragma once

#include <string>

#include "Vehicle.h"

class Car : public Vehicle
{
    protected:
        std::string make;
        std::string model;

    public:
        virtual std::string GetMake()
        {
            return make;
        }

        virtual std::string GetModel()
        {
            return model;
        }

        VEHICLE_TYPE GetVehicleType() override
        {
            return VEHICLE_TYPE::CAR;
        }
};
