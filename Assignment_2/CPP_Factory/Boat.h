#pragma once

#include "Vehicle.h"

class Boat : public Vehicle
{
    public:
        std::string GetVehicleName() override
        {
            return "basic";
        }

        VEHICLE_TYPE GetVehicleType() override
        {
            return VEHICLE_TYPE::BOAT;
        }
};
