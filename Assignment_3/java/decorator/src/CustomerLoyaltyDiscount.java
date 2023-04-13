public class CustomerLoyaltyDiscount {
    static void Discount (Customer customer) {

        if (customer.GetStatus() == CustomerStatus.PREMIUM) {
            System.out.println("Customer Premium Discount applied: $1.0");
            customer.AddDiscount(1.0f);
        }
        else if (customer.GetStatus() == CustomerStatus.ROYAL) {
            System.out.println("Customer Royal Discount applied: $1.25");
            customer.AddDiscount(1.25f);
        }
    }
}
