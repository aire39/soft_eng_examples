#pragma once

#include <memory>
#include "AbstractFactory.h"

#include "Vehicle.h"
#include "PorcheBoxster.h"
#include "PorcheCayman.h"

class PorcheFactory : public AbstractFactory
{
    public:
        PorcheFactory(const PorcheFactory&) = delete;
        void operator=(const PorcheFactory&) = delete;
        ~PorcheFactory() = default;

        static AbstractFactory* instance()
        {
            static PorcheFactory factory;
            return &factory;
        }

        std::unique_ptr<Vehicle> build(std::string model) override
        {
            std::unique_ptr<Vehicle> new_car;

            if(model == "boxster")
            {
                new_car = std::make_unique<PorcheBoxster>();
            }
            else if(model == "cayman")
            {
                new_car = std::make_unique<PorcheCayman>();
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
            return "Porche";
        }

    private:
        PorcheFactory() = default;
};
