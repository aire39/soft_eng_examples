#pragma once

#include <memory>

#include "AbstractFactory.h"
#include "Vehicle.h"
#include "TeslaX.h"
#include "TeslaS.h"

class TeslaFactory : public AbstractFactory
{
    private:
        TeslaFactory() = default;

    public:
        ~TeslaFactory() = default;
        TeslaFactory(const TeslaFactory&) = delete;
        void operator=(const TeslaFactory&) = delete;

        static AbstractFactory* instance()
        {
            static TeslaFactory factory;
            return &factory;
        }

        std::unique_ptr<Vehicle> build(std::string model) override
        {
            std::unique_ptr<Vehicle> new_car;

            if(model == "teslax")
            {
                new_car = std::make_unique<TeslaX>();
            }
            else if(model == "teslas")
            {
                new_car = std::make_unique<TeslaS>();
            }

            return std::move(new_car);
        }

        void repair(Vehicle* repair_vehicle) override
        {
            if (repair_vehicle && (repair_vehicle->GetVehicleType() == VEHICLE_TYPE::CAR))
            {
                std::cout << GetFactoryName() << " will repair " << repair_vehicle->GetVehicleName() << " " << repair_vehicle->GetVehicleType() << std::endl;
            }
            else
            {
                std::cerr << GetFactoryName() << " can only repair cars!" << std::endl;
            }
        }

        void restore(Vehicle* restore_vehicle) override
        {
            if (restore_vehicle && (restore_vehicle->GetVehicleType() == VEHICLE_TYPE::CAR))
            {
                std::cout << GetFactoryName() << " will restore " << restore_vehicle->GetVehicleName() << " " << restore_vehicle->GetVehicleType() << std::endl;
            }
            else
            {
                std::cerr << GetFactoryName() << " can only restore cars!" << std::endl;
            }
        }

        std::string GetFactoryName()
        {
            return "Tesla";
        }
};
