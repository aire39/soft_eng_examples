class Car implements Vehicle {
    private String modelName = "basic";

    protected void SetName(String model_name) {
        modelName = model_name;
    }

    @Override
    public String GetName() {
        return modelName;
    }

    @Override
    public VehicleType GetType() {
        return VehicleType.CAR;
    }
};
