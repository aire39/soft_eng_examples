#pragma once

#include "Vehicle.h"

class Build
{
    public:
        virtual std::unique_ptr<Vehicle> build(std::string model) = 0;
};
