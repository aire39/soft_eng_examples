#pragma once

#include <memory>
#include "AbstractFactory.h"

#include "Vehicle.h"
#include "Boat.h"

class SearayFactory : public AbstractFactory
{
    public:
        SearayFactory(const SearayFactory&) = delete;
        void operator=(const SearayFactory&) = delete;
        ~SearayFactory() = default;

        static AbstractFactory* instance()
        {
            static SearayFactory factory;
            return &factory;
        }

        std::unique_ptr<Vehicle> build(std::string model) override
        {
            std::unique_ptr<Vehicle> new_boat = std::make_unique<Boat>();
            return std::move(new_boat);
        }

        void repair(Vehicle* repair_vehicle) override
        {
            if (repair_vehicle && (repair_vehicle->GetVehicleType() == VEHICLE_TYPE::BOAT))
            {
                std::cout << GetFactoryName() << " will repair " << repair_vehicle->GetVehicleName() << " " << repair_vehicle->GetVehicleType() << std::endl;
            }
            else
            {
                std::cerr << GetFactoryName() << " can only repair boats!" << std::endl;
            }
        }

        void restore(Vehicle* restore_vehicle) override
        {
            if (restore_vehicle && (restore_vehicle->GetVehicleType() == VEHICLE_TYPE::BOAT))
            {
                std::cout << GetFactoryName() << " will restore " << restore_vehicle->GetVehicleName() << " " << restore_vehicle->GetVehicleType() << std::endl;
            }
            else
            {
                std::cerr << GetFactoryName() << " can only restore boats!" << std::endl;
            }
        }

        std::string GetFactoryName()
        {
            return "Searay";
        }

    private:
        SearayFactory() = default;
};
