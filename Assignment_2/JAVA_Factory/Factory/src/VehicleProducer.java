import com.sun.jdi.InvalidTypeException;

class VehicleProducer {
    public static AbstractFactory GetFactory(VehicleType vehicle_type, String vehicle_model)
        {
            AbstractFactory factory;

            if (vehicle_type == VehicleType.CAR) {
                switch (vehicle_model) {
                    case "honda" -> factory = HondaFactory.instance();
                    case "tesla" -> factory = TeslaFactory.instance();
                    case "porche" -> factory = PorcheFactory.instance();
                    default -> {
                        throw new RuntimeException("No valid car vehicle model was chosen!");
                    }
                }
            }
            else if (vehicle_type == VehicleType.AIRPLANE) {
                switch (vehicle_model) {
                    case "boeing" -> factory = BoeingFactory.instance();
                    case "embraer" -> factory = EmbraerFactory.instance();
                    case "airbus" -> factory = AirbusFactory.instance();
                    default -> {
                        throw new RuntimeException("No valid airplane vehicle model was chosen!");
                    }
                }
            }
            else if (vehicle_type == VehicleType.BOAT) {
                switch (vehicle_model) {
                    case "searay" -> factory = SearayFactory.instance();
                    case "mastercraft" -> factory = MastercraftFactory.instance();
                    case "bertram" -> factory = BertramFactory.instance();
                    default -> {
                        throw new RuntimeException("No valid boat vehicle model was chosen!");
                    }
                }
            }
            else {
                throw new RuntimeException("No valid vehicle type or make was chosen!");
            }

            return factory;
        }
};
