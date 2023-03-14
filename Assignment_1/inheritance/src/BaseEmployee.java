public class BaseEmployee extends Employee {
    private double baseSalary = 0.0;

    public BaseEmployee() {}
    public BaseEmployee(String first_name, String last_name, String social_security_number, double base_salary) {
        super(first_name, last_name, social_security_number);
        SetBaseSalary(base_salary);
    }

    public void SetBaseSalary(double base_salary) {
        baseSalary = base_salary;
    }

    public double GetBaseSalary() {
        return baseSalary;
    }
}
