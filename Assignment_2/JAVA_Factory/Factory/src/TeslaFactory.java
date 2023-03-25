class TeslaFactory implements AbstractFactory {
    private static TeslaFactory factory = null;

    private TeslaFactory() {
    }

        static AbstractFactory instance()
        {
            if(factory == null) {
                factory = new TeslaFactory();
            }

            return factory;
        }

        @Override
        public Vehicle build(String model)
        {
            Vehicle new_car;

            if(model.equals("modelx"))
            {
                new_car = new TeslaX();
            }
            else if(model.equals("models"))
            {
                new_car = new TeslaS();
            }
            else
            {
                new_car = null;
            }

            return new_car;
        }

        @Override
        public void repair(Vehicle repair_vehicle)
        {
            if (repair_vehicle.GetType() == VehicleType.CAR)
            {
                System.out.println(GetFactoryName() + " will repair " + repair_vehicle.GetName() + " " + repair_vehicle.GetType());
            }
            else
            {
                System.err.println(GetFactoryName() + " can only repair cars!");
            }
        }

        @Override
        public void restore(Vehicle restore_vehicle)
        {
            if (restore_vehicle.GetType() == VehicleType.CAR)
            {
                System.out.println(GetFactoryName() + " will restore " + restore_vehicle.GetName() + " " + restore_vehicle.GetType());
            }
            else
            {
                System.err.println(GetFactoryName() + " can only restore cars!");
            }
        }

        public String GetFactoryName()
        {
            return "Tesla";
        }
};
