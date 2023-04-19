import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<PaymentGateway> payment_gateways = new Vector<>();

        PaypalGateway paypal_gateway = new PaypalGateway();
        paypal_gateway.SetEmail("test@test.com");
        payment_gateways.add(paypal_gateway);

        StripeGateway stripe_gateway = new StripeGateway();
        stripe_gateway.SetCardName("Joe");
        stripe_gateway.SetCardNumber("161843541354");
        stripe_gateway.SetExpiration(3, 2028);
        payment_gateways.add(stripe_gateway);

        SquareGateway square_gateway = new SquareGateway();
        square_gateway.SetLocationId(3);
        PaymentAdapter payment_adapter = new PaymentAdapter(square_gateway);
        payment_gateways.add(payment_adapter);

        for (PaymentGateway pay : payment_gateways) {
            String result = pay.PayAmount(1.0f);
            System.out.println(result);
        }

    }
}
