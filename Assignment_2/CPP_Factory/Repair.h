#pragma once

#include "Vehicle.h"

class Repair
{
    public:
        virtual void repair(Vehicle* repair_vehicle) = 0;
};
