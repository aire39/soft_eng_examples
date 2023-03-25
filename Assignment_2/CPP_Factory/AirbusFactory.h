#pragma once

#include <memory>
#include "AbstractFactory.h"

#include "Vehicle.h"
#include "Airplane.h"

class AirbusFactory : public AbstractFactory
{
    public:
        AirbusFactory(const AirbusFactory&) = delete;
        void operator=(const AirbusFactory&) = delete;
        ~AirbusFactory() = default;

        static AbstractFactory* instance()
        {
            static AirbusFactory factory;
            return &factory;
        }

        std::unique_ptr<Vehicle> build(std::string model) override
        {
            std::unique_ptr<Vehicle> new_airplane = std::make_unique<Airplane>();
            return std::move(new_airplane);
        }

        void repair(Vehicle* repair_vehicle) override
        {
            if (repair_vehicle && (repair_vehicle->GetVehicleType() == VEHICLE_TYPE::AIRPLANE))
            {
                std::cout << GetFactoryName() << " will repair " << repair_vehicle->GetVehicleName() << " " << repair_vehicle->GetVehicleType() << std::endl;
            }
            else
            {
                std::cerr << GetFactoryName() << " can only repair airplanes!" << std::endl;
            }
        }

        void restore(Vehicle* restore_vehicle) override
        {
            if (restore_vehicle && (restore_vehicle->GetVehicleType() == VEHICLE_TYPE::AIRPLANE))
            {
                std::cout << GetFactoryName() << " will restore " << restore_vehicle->GetVehicleName() << " " << restore_vehicle->GetVehicleType() << std::endl;
            }
            else
            {
                std::cerr << GetFactoryName() << " can only restore airplanes!" << std::endl;
            }
        }

        std::string GetFactoryName()
        {
            return "Airbus";
        }

    private:
        AirbusFactory() = default;
};
