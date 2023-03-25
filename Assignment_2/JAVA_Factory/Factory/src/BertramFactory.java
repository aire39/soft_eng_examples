class BertramFactory implements AbstractFactory
{
    private static BertramFactory factory = null;

        public static AbstractFactory instance()
        {
            if (factory == null)
                factory = new BertramFactory();

            return factory;
        }

        @Override
        public Vehicle build(String model) {
            return new Boat();
        }

        @Override
        public void repair(Vehicle repair_vehicle)
        {
            if (repair_vehicle.GetType() == VehicleType.BOAT)
            {
                System.out.println(GetFactoryName() + " will repair " + repair_vehicle.GetName() + " " + repair_vehicle.GetType());
            }
            else
            {
                System.err.println(GetFactoryName() + " can only repair boats!");
            }
        }

        @Override
        public void restore(Vehicle restore_vehicle)
        {
            if (restore_vehicle.GetType() == VehicleType.BOAT)
            {
                System.out.println(GetFactoryName() + " will restore " + restore_vehicle.GetName() + " " + restore_vehicle.GetType());
            }
            else
            {
                System.err.println(GetFactoryName() + " can only restore boats!");
            }
        }

        public String GetFactoryName() {
            return "Bertram";
        }
};
