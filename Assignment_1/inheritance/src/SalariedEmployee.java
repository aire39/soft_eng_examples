public class SalariedEmployee extends Employee {
    private double weeklySalary = 0.0;

    SalariedEmployee() {}
    SalariedEmployee(String first_name, String last_name, String social_security_number, double weekly_salary) {
        super(first_name, last_name, social_security_number);
        SetWeeklySalary(weekly_salary);
    }

    public void SetWeeklySalary(double weekly_salary) {
        weeklySalary = weekly_salary;
    }

    public double GetWeeklySalary() {
        return weeklySalary;
    }
}
