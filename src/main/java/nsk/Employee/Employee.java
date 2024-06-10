package src.main.java.nsk.Employee;

public class Employee extends Entity {

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    private double salary;

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    public Employee(String name, int age, String sex) {
        super(name, age, sex);
    }

    public Employee(String name, int age, String sex, double salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

}
