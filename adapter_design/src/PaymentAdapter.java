public class PaymentAdapter implements PaymentGateway {
    private final SquareGateway squareGateway;

    PaymentAdapter(SquareGateway square_gateway) {
        this.squareGateway = square_gateway;
    }

    @Override
    public String PayAmount(float amount) {
        return squareGateway.PayLocation(amount);
    }
}
