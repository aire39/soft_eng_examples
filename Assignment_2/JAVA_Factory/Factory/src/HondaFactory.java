class HondaFactory implements AbstractFactory {
    private static HondaFactory factory = null;

    private HondaFactory() {
    }

        static AbstractFactory instance()
        {
            if(factory == null) {
                factory = new HondaFactory();
            }

            return factory;
        }

        @Override
        public Vehicle build(String model)
        {
            Vehicle new_car;

            if(model.equals("accord"))
            {
                new_car = new HondaAccord();
            }
            else if(model.equals("crv"))
            {
                new_car = new HondaCRV();
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
            return "Honda";
        }
};
