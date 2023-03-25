public enum VehicleType {
    CAR("Car"),
    AIRPLANE("Airplane"),
    BOAT("Boat");

    String vehicleTypeName;

    VehicleType(String vehicle_type) {
        vehicleTypeName = vehicle_type;
    }

    String GetVehicleTypeName() {
        return vehicleTypeName;
    }
}
