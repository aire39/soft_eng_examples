class PorcheFactory implements AbstractFactory {
    private static PorcheFactory factory = null;

    private PorcheFactory() {
    }

        static AbstractFactory instance()
        {
            if(factory == null) {
                factory = new PorcheFactory();
            }

            return factory;
        }

        @Override
        public Vehicle build(String model)
        {
            Vehicle new_car;

            if(model.equals("cayman"))
            {
                new_car = new PorcheBoxster();
            }
            else if(model.equals("boxster"))
            {
                new_car = new PorcheBoxster();
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
