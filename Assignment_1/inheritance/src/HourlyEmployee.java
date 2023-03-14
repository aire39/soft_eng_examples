public class HourlyEmployee extends Employee {
    private double wage = 0.0;
    private int numberHoursWorked = 0;

    HourlyEmployee() {}
    HourlyEmployee(String first_name, String last_name, String social_security_number, double wage, int number_hours_worked) {
        super(first_name, last_name, social_security_number);
        SetWage(wage);
        SetNumHoursWorked(number_hours_worked);
    }

    void SetNumHoursWorked(int num_hours_worked) {
        numberHoursWorked = num_hours_worked;
    }

    int GetNumHoursWorked() {
        return numberHoursWorked;
    }

    public void SetWage(double wage) {
        this.wage = wage;
    }

    public double GetWage() {
        return wage;
    }

}
