public class Main {
    public static void main(String[] args) {

        AbstractFactory honda_factory = null;
        try
        {
            honda_factory = VehicleProducer.GetFactory(VehicleType.CAR, "honda");
        }
        catch (RuntimeException e)
        {
            System.err.println(e.getMessage());
            return;
        }

        Vehicle honda_accord_car = honda_factory.build("accord");

        System.out.println(honda_factory.GetFactoryName() + " built a " + honda_accord_car.GetName() + " " + honda_accord_car.GetType());

        honda_factory.repair(honda_accord_car);
        honda_factory.restore(honda_accord_car);

        AbstractFactory tesla_factory = null;
        try
        {
            tesla_factory = VehicleProducer.GetFactory(VehicleType.CAR, "tesla");
        }
        catch (RuntimeException e)
        {
            System.err.println(e.getMessage());
            return;
        }

        Vehicle teslax_car = tesla_factory.build("modelx");

        System.out.println(tesla_factory.GetFactoryName() + " built a " + teslax_car.GetName() + " " + teslax_car.GetType());

        tesla_factory.repair(teslax_car);
        tesla_factory.restore(teslax_car);

        AbstractFactory porche_factory = null;
        try
        {
            porche_factory = VehicleProducer.GetFactory(VehicleType.CAR, "porche");
        }
        catch (RuntimeException e)
        {
            System.err.println(e.getMessage());
            return;
        }

        Vehicle porche_cayman_car = porche_factory.build("cayman");

        System.out.println(porche_factory.GetFactoryName() + " built a " + porche_cayman_car.GetName() + " " + porche_cayman_car.GetType());

        porche_factory.repair(porche_cayman_car);
        porche_factory.restore(porche_cayman_car);

        /* what happens when I try to create another instance of say the HondaFactory?
         *
         * Trying to create another instance of the class gives me a
         * compile error and that the class has a private constructor.
         *
         * the instance below is commented out but here to reference what happens.
         */

        //HondaFactory second_honda_factory = new HondaFactory();


        AbstractFactory boeing_factory = null;
        try
        {
            boeing_factory = VehicleProducer.GetFactory(VehicleType.AIRPLANE, "boeing");
        }
        catch (RuntimeException e)
        {
            System.err.println(e.getMessage());
            return;
        }

        Vehicle boeing_basic_airplane = boeing_factory.build("basic");

        System.out.println(boeing_factory.GetFactoryName() + " built a " + boeing_basic_airplane.GetName() + " " + boeing_basic_airplane.GetType());

        boeing_factory.repair(boeing_basic_airplane);
        boeing_factory.restore(boeing_basic_airplane);

        AbstractFactory embraer_factory = null;
        try
        {
            embraer_factory = VehicleProducer.GetFactory(VehicleType.AIRPLANE, "embraer");
        }
        catch (RuntimeException e)
        {
            System.err.println(e.getMessage());
            return;
        }

        Vehicle embraer_basic_airplane = embraer_factory.build("basic");

        System.out.println(embraer_factory.GetFactoryName() + " built a " + embraer_basic_airplane.GetName() + " " + embraer_basic_airplane.GetType());

        embraer_factory.repair(embraer_basic_airplane);
        embraer_factory.restore(embraer_basic_airplane);

        AbstractFactory airbus_factory = null;
        try
        {
            airbus_factory = VehicleProducer.GetFactory(VehicleType.AIRPLANE, "airbus");
        }
        catch (RuntimeException e)
        {
            System.err.println(e.getMessage());
            return;
        }

        Vehicle airbus_basic_airplane = airbus_factory.build("basic");

        System.out.println(airbus_factory.GetFactoryName() + " built a " + airbus_basic_airplane.GetName() + " " + airbus_basic_airplane.GetType());

        airbus_factory.repair(airbus_basic_airplane);
        airbus_factory.restore(airbus_basic_airplane);

        /* what happens when I try to create another instance of say the AirbusFactory?
         *
         * Trying to create another instance of the class gives me a
         * compile error and that the class has a private constructor.
         *
         * the instance below is commented out but here to reference what happens.
         */

        // AirbusFactory second_airbus_factory = new AirbusFactory();

        AbstractFactory searay_factory = null;
        try
        {
            searay_factory = VehicleProducer.GetFactory(VehicleType.BOAT, "searay");
        }
        catch (RuntimeException e)
        {
            System.err.println(e.getMessage());
            return;
        }

        Vehicle searay_basic_boat = searay_factory.build("basic");

        System.out.println(searay_factory.GetFactoryName() + " built a " + searay_basic_boat.GetName() + " " + searay_basic_boat.GetType());

        searay_factory.repair(searay_basic_boat);
        searay_factory.restore(searay_basic_boat);

        AbstractFactory mastercraft_factory = null;
        try
        {
            mastercraft_factory = VehicleProducer.GetFactory(VehicleType.BOAT, "mastercraft");
        }
        catch (RuntimeException e)
        {
            System.err.println(e.getMessage());
            return;
        }

        Vehicle mastercraft_basic_boat = mastercraft_factory.build("basic");

        System.out.println(mastercraft_factory.GetFactoryName() + " built a " + mastercraft_basic_boat.GetName() + " " + mastercraft_basic_boat.GetType());

        mastercraft_factory.repair(mastercraft_basic_boat);
        mastercraft_factory.restore(mastercraft_basic_boat);

        AbstractFactory bertram_factory = null;
        try
        {
            bertram_factory = VehicleProducer.GetFactory(VehicleType.BOAT, "bertram");
        }
        catch (RuntimeException e)
        {
            System.err.println(e.getMessage());
            return;
        }

        Vehicle bertram_basic_boat = bertram_factory.build("basic");

        System.out.println(bertram_factory.GetFactoryName() + " built a " + bertram_basic_boat.GetName() + " " + bertram_basic_boat.GetType());

        bertram_factory.repair(bertram_basic_boat);
        bertram_factory.restore(bertram_basic_boat);
    }
}