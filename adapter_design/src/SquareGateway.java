public class SquareGateway {
    private int locationId;

    void SetLocationId(int location_id) {
        this.locationId = location_id;
    }

    public String PayLocation(float amount) {
        String result;
        if (locationId >= 0) {
            if ((locationId % 2) == 0) {
                result = "Using Square to make payment of $" + amount * 1.02f;
            }
            else {
                result = "Using Square to make payment of $" + amount * 1.01f;
            }
        }
        else {
            result = "Square needs valid location id!";
        }

        return result;
    }
}
