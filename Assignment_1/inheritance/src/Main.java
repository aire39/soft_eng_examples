import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee employee_joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee employee_stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.0, 32);
        HourlyEmployee employee_mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.0, 47);
        CommissionEmployee employee_nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444 ", 15.0, 50000.0);
        SalariedEmployee employee_renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700.0);
        BaseEmployee employee_mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000.0);
        CommissionEmployee employee_mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22.0, 40000.0);

        System.out.print(employee_joe.GetFirstName() + " " + employee_joe.GetLastName() + " " + employee_joe.GetSocialSecurityNumber() + " " + employee_joe.GetWeeklySalary() + "\n");
        System.out.print(employee_stephanie.GetFirstName() + " " + employee_stephanie.GetLastName() + " " + employee_stephanie.GetSocialSecurityNumber() + " " + employee_stephanie.GetWage() + " " + employee_stephanie.GetNumHoursWorked() + "\n");
        System.out.print(employee_mary.GetFirstName() + " " + employee_mary.GetLastName() + " " + employee_mary.GetSocialSecurityNumber() + " " + employee_mary.GetWage() + " " + employee_mary.GetNumHoursWorked() + "\n");
        System.out.print(employee_nicole.GetFirstName() + " " + employee_nicole.GetLastName() + " " + employee_nicole.GetSocialSecurityNumber() + " " + employee_nicole.GetCommissionRate() + " " + employee_nicole.GetGrossSales() + "\n");
        System.out.print(employee_renwa.GetFirstName() + " " + employee_renwa.GetLastName() + " " + employee_renwa.GetSocialSecurityNumber() + " " + employee_renwa.GetWeeklySalary() + "\n");
        System.out.print(employee_mike.GetFirstName() + " " + employee_mike.GetLastName() + " " + employee_mike.GetSocialSecurityNumber() + " " + employee_mike.GetBaseSalary() + "\n");
        System.out.print(employee_mahnaz.GetFirstName() + " " + employee_mahnaz.GetLastName() + " " + employee_mahnaz.GetSocialSecurityNumber() + " " + employee_mahnaz.GetCommissionRate() + " " + employee_mahnaz.GetGrossSales() + "\n");
    }
}