#pragma once

#include <stdexcept>

#include "Vehicle.h"
#include "AbstractFactory.h"

#include "HondaFactory.h"
#include "TeslaFactory.h"
#include "PorcheFactory.h"
#include "AirbusFactory.h"
#include "BoeingFactory.h"
#include "EmbraerFactory.h"
#include "SearayFactory.h"
#include "MastercraftFactory.h"
#include "BertramFactory.h"

class VehicleProducer
{
    public:
        static AbstractFactory* GetFactory(VEHICLE_TYPE vehicle_type, std::string vehicle_model)
        {
            AbstractFactory* factory = nullptr;

            if (vehicle_type == VEHICLE_TYPE::CAR)
            {
                if(vehicle_model == "honda")
                {
                    factory = HondaFactory::instance();
                }
                else if(vehicle_model == "tesla")
                {
                    factory = TeslaFactory::instance();
                }
                else if(vehicle_model == "porche")
                {
                    factory = PorcheFactory::instance();
                }
                else
                {
                    throw std::invalid_argument("No valid car vehicle model was chosen!");
                }
            }
            else if (vehicle_type == VEHICLE_TYPE::AIRPLANE)
            {
                if(vehicle_model == "boeing")
                {
                    factory = BoeingFactory::instance();
                }
                else if(vehicle_model == "embraer")
                {
                    factory = EmbraerFactory::instance();
                }
                else if(vehicle_model == "airbus")
                {
                    factory = AirbusFactory::instance();
                }
                else
                {
                    throw std::invalid_argument("No valid airplane vehicle model was chosen!");
                }
            }
            else if (vehicle_type == VEHICLE_TYPE::BOAT)
            {
                if(vehicle_model == "searay")
                {
                    factory = SearayFactory::instance();
                }
                else if(vehicle_model == "mastercraft")
                {
                    factory = MastercraftFactory::instance();
                }
                else if(vehicle_model == "bertram")
                {
                    factory = BertramFactory::instance();
                }
                else
                {
                    throw std::invalid_argument("No valid boat vehicle model was chosen!");
                }
            }
            else
            {
                throw std::invalid_argument("No valid vehicle type or make was chosen!");
            }

            return factory;
        }
};
