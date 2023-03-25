class EmbraerFactory implements AbstractFactory {
    private static EmbraerFactory factory = null;

    public static AbstractFactory instance() {
        if (factory == null)
            factory = new EmbraerFactory();

        return factory;
    }

    @Override
    public Vehicle build(String model) {
        return new Airplane();
    }

    @Override
    public void repair(Vehicle repair_vehicle) {
        if (repair_vehicle.GetType() == VehicleType.AIRPLANE)
        {
            System.out.println(GetFactoryName() + " will repair " + repair_vehicle.GetName() + " " + repair_vehicle.GetType());
        }
        else
        {
            System.err.println(GetFactoryName() + " can only repair airplanes!");
        }
    }

    @Override
    public void restore(Vehicle restore_vehicle) {
        if (restore_vehicle.GetType() == VehicleType.AIRPLANE)
        {
            System.out.println(GetFactoryName() + " will restore " + restore_vehicle.GetName() + " " + restore_vehicle.GetType());
        }
        else
        {
            System.err.println(GetFactoryName() + " can only restore airplanes!");
        }
    }

    public String GetFactoryName() {
        return "Embraer";
    }
};
