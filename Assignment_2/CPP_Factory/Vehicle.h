#pragma once

#include <cstdint>
#include <string>
#include <array>

enum class VEHICLE_TYPE : uint32_t {CAR=0, AIRPLANE, BOAT};
std::ostream& operator<<(std::ostream& os, const VEHICLE_TYPE& vehicle_type)
{
    if (vehicle_type == VEHICLE_TYPE::CAR)
        os << "car";
    else if (vehicle_type == VEHICLE_TYPE::AIRPLANE)
        os << "airplane";
    else if (vehicle_type == VEHICLE_TYPE::BOAT)
        os << "boat";

    return os;
}

class Vehicle
{
    public:
        virtual std::string GetVehicleName() = 0;
        virtual VEHICLE_TYPE GetVehicleType() = 0;
};
