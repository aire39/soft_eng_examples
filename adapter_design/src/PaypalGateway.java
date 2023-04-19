public class PaypalGateway implements PaymentGateway {
    private String email;

    public void SetEmail (String email) {
        this.email = email;
    }

    @Override
    public String PayAmount(float amount) {
        String result;
        if (email.contains("@") && email.contains(".com")) {
            result = "Using Paypal to make payment of $" + amount;
        }
        else {
            result = "PayPal needs valid email!";
        }

        return result;
    }
}
