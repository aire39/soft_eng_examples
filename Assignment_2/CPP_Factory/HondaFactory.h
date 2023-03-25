#pragma once

#include <memory>
#include "AbstractFactory.h"

#include "Vehicle.h"
#include "HondaAccord.h"
#include "HondaCRV.h"

class HondaFactory : public AbstractFactory
{
    public:
        HondaFactory(const HondaFactory&) = delete;
        void operator=(const HondaFactory&) = delete;
        ~HondaFactory() = default;

        static AbstractFactory* instance()
        {
            static HondaFactory factory;
            return &factory;
        }

        std::unique_ptr<Vehicle> build(std::string model) override
        {
            std::unique_ptr<Vehicle> new_car;

            if(model == "accord")
            {
                new_car = std::make_unique<HondaAccord>();
            }
            else if(model == "crv")
            {
                new_car = std::make_unique<HondaCRV>();
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
            return "Honda";
        }

    private:
        HondaFactory() = default;
};
