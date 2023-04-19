public class StripeGateway implements PaymentGateway {
    private String name;
    private String cardNumber;
    CardExpiration expiration;

    public void SetCardName (String name) {
        this.name = name;
    }

    public void SetCardNumber (String card_number) {
        cardNumber = card_number;
    }

    public void SetExpiration(int month, int year) {
        expiration = new CardExpiration();
        expiration.month = month;
        expiration.year = year;
    }

    @Override
    public String PayAmount(float amount) {
        String result;
        if (!name.isEmpty() && !cardNumber.isEmpty() && (expiration.year >= 2023) && (expiration.month >= 1)) {
            result = "Using Stripe to make payment of $" + amount;
        }
        else {
            result = "Stripe needs valid card name, number and expiration date!";
        }

        return result;
    }
}
