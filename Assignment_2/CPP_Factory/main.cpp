#include <iostream>
#include <memory>

#include "Vehicle.h"
#include "VehicleProducer.h"
#include "TeslaFactory.h"
#include "AirbusFactory.h"

int main(int argc, char*argv[])
{
    AbstractFactory* honda_factory = nullptr;
    try
    {
        honda_factory = VehicleProducer::GetFactory(VEHICLE_TYPE::CAR, "honda");
    }
    catch (const std::invalid_argument& e)
    {
        std::cerr << e.what() << std::endl;
        return -1;
    }

    auto honda_accord_car = honda_factory->build("accord");
    
    std::cout << honda_factory->GetFactoryName() << " built a " << honda_accord_car->GetVehicleName() << " " << honda_accord_car->GetVehicleType() << std::endl;

    honda_factory->repair(honda_accord_car.get());
    honda_factory->restore(honda_accord_car.get());

    AbstractFactory* tesla_factory = nullptr;
    try
    {
        tesla_factory = VehicleProducer::GetFactory(VEHICLE_TYPE::CAR, "tesla");
    }
    catch (const std::invalid_argument& e)
    {
        std::cerr << e.what() << std::endl;
        return -1;
    }

    auto teslax_car = tesla_factory->build("teslax");
    
    std::cout << tesla_factory->GetFactoryName() << " built a " << teslax_car->GetVehicleName() << " " << teslax_car->GetVehicleType() << std::endl;

    tesla_factory->repair(teslax_car.get());
    tesla_factory->restore(teslax_car.get());

    AbstractFactory* porche_factory = nullptr;
    try
    {
        porche_factory = VehicleProducer::GetFactory(VEHICLE_TYPE::CAR, "porche");
    }
    catch (const std::invalid_argument& e)
    {
        std::cerr << e.what() << std::endl;
        return -1;
    }

    auto porche_cayman_car = porche_factory->build("cayman");
    
    std::cout << porche_factory->GetFactoryName() << " built a " << porche_cayman_car->GetVehicleName() << " " << porche_cayman_car->GetVehicleType() << std::endl;

    porche_factory->repair(porche_cayman_car.get());
    porche_factory->restore(porche_cayman_car.get());

    /* what happens when I try to create another instance of say the HondaFactory?
     *
     * Trying to create another instance of the class gives me a
     * compile error and that the class has a private constructor.
     *
     * the instance below is commented out but here to reference what happens.
    */

    // auto second_honda_factory = std::make_unique<HondaFactory>();


    AbstractFactory* boeing_factory = nullptr;
    try
    {
        boeing_factory = VehicleProducer::GetFactory(VEHICLE_TYPE::AIRPLANE, "boeing");
    }
    catch (const std::invalid_argument& e)
    {
        std::cerr << e.what() << std::endl;
        return -1;
    }

    auto boeing_basic_airplane = boeing_factory->build("basic");
    
    std::cout << boeing_factory->GetFactoryName() << " built a " << boeing_basic_airplane->GetVehicleName() << " " << boeing_basic_airplane->GetVehicleType() << std::endl;

    boeing_factory->repair(boeing_basic_airplane.get());
    boeing_factory->restore(boeing_basic_airplane.get());

    AbstractFactory* embraer_factory = nullptr;
    try
    {
        embraer_factory = VehicleProducer::GetFactory(VEHICLE_TYPE::AIRPLANE, "embraer");
    }
    catch (const std::invalid_argument& e)
    {
        std::cerr << e.what() << std::endl;
        return -1;
    }

    auto embraer_basic_airplane = embraer_factory->build("basic");
    
    std::cout << embraer_factory->GetFactoryName() << " built a " << embraer_basic_airplane->GetVehicleName() << " " << embraer_basic_airplane->GetVehicleType() << std::endl;

    embraer_factory->repair(embraer_basic_airplane.get());
    embraer_factory->restore(embraer_basic_airplane.get());

    AbstractFactory* airbus_factory = nullptr;
    try
    {
        airbus_factory = VehicleProducer::GetFactory(VEHICLE_TYPE::AIRPLANE, "airbus");
    }
    catch (const std::invalid_argument& e)
    {
        std::cerr << e.what() << std::endl;
        return -1;
    }

    auto airbus_basic_airplane = airbus_factory->build("basic");
    
    std::cout << airbus_factory->GetFactoryName() << " built a " << airbus_basic_airplane->GetVehicleName() << " " << airbus_basic_airplane->GetVehicleType() << std::endl;

    airbus_factory->repair(airbus_basic_airplane.get());
    airbus_factory->restore(airbus_basic_airplane.get());

    /* what happens when I try to create another instance of say the AirbusFactory?
     *
     * Trying to create another instance of the class gives me a
     * compile error and that the class has a private constructor.
     *
     * the instance below is commented out but here to reference what happens.
    */

    // auto second_airbus_factory = std::make_unique<AirbusFactory>();

    AbstractFactory* searay_factory = nullptr;
    try
    {
        searay_factory = VehicleProducer::GetFactory(VEHICLE_TYPE::BOAT, "searay");
    }
    catch (const std::invalid_argument& e)
    {
        std::cerr << e.what() << std::endl;
        return -1;
    }

    auto searay_basic_boat = searay_factory->build("basic");
    
    std::cout << searay_factory->GetFactoryName() << " built a " << searay_basic_boat->GetVehicleName() << " " << searay_basic_boat->GetVehicleType() << std::endl;

    searay_factory->repair(searay_basic_boat.get());
    searay_factory->restore(searay_basic_boat.get());

    AbstractFactory* mastercraft_factory = nullptr;
    try
    {
        mastercraft_factory = VehicleProducer::GetFactory(VEHICLE_TYPE::BOAT, "mastercraft");
    }
    catch (const std::invalid_argument& e)
    {
        std::cerr << e.what() << std::endl;
        return -1;
    }

    auto mastercraft_basic_boat = mastercraft_factory->build("basic");
    
    std::cout << mastercraft_factory->GetFactoryName() << " built a " << mastercraft_basic_boat->GetVehicleName() << " " << mastercraft_basic_boat->GetVehicleType() << std::endl;

    mastercraft_factory->repair(mastercraft_basic_boat.get());
    mastercraft_factory->restore(mastercraft_basic_boat.get());

    AbstractFactory* bertram_factory = nullptr;
    try
    {
        bertram_factory = VehicleProducer::GetFactory(VEHICLE_TYPE::BOAT, "bertram");
    }
    catch (const std::invalid_argument& e)
    {
        std::cerr << e.what() << std::endl;
        return -1;
    }

    auto bertram_basic_boat = bertram_factory->build("basic");
    
    std::cout << bertram_factory->GetFactoryName() << " built a " << bertram_basic_boat->GetVehicleName() << " " << bertram_basic_boat->GetVehicleType() << std::endl;

    bertram_factory->repair(bertram_basic_boat.get());
    bertram_factory->restore(bertram_basic_boat.get());

    return 0;
}
