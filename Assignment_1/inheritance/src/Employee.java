public abstract class Employee {
    protected String firstName = "none";
    protected String lastName = "none";
    protected String socialSecurityNumber = "xxx-xx-xxxx";

    Employee() {}
    Employee(String first_name, String last_name, String social_security_number)
    {
        SetName(first_name, last_name);
        SetSocialSecurityNumber(social_security_number);
    }

    public void SetName(String first_name, String last_name)
    {
        firstName = first_name;
        lastName = last_name;
    }

    public void SetSocialSecurityNumber(String social_security_number)
    {
        socialSecurityNumber = social_security_number;
    }

    public String GetFirstName() {
        return firstName;
    }

    public String GetLastName() {
        return lastName;
    }

    public String GetSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}
