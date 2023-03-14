public class CommissionEmployee extends Employee {
    private double commissionRate = 0.0;
    private double grossSales = 0.0;

    CommissionEmployee() {}

    CommissionEmployee(String first_name, String last_name, String social_security_number, double commission_rate, double gross_sales) {
        super(first_name, last_name, social_security_number);
        SetCommissionRate(commission_rate);
        SetGrossSales(gross_sales);
    }

    public void SetGrossSales(double gross_sales) {
        grossSales = gross_sales;
    }

    public double GetGrossSales() {
        return grossSales;
    }

    public void SetCommissionRate(double commission_rate) {
        commissionRate = commission_rate;
    }

    public double GetCommissionRate() {
        return commissionRate;
    }
}
