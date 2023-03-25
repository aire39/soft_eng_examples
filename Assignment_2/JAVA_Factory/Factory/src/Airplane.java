class Airplane implements Vehicle {
    private String modelName = "basic";

    public void SetName(String model_name) {
        modelName = model_name;
    }

    @Override
    public String GetName() {
        return modelName;
    }

    @Override
    public VehicleType GetType() {
        return VehicleType.AIRPLANE;
    }
};
