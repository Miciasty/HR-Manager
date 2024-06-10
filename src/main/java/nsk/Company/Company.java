package src.main.java.nsk.Company;

import src.main.java.nsk.Employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Company {

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    private String name;
    private String address;
    private String phone;

    private List<Employee> employees = new ArrayList<Employee>();

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    public Company(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public List<Employee> getEmployees() { return employees; }
    public Employee getEmployee(int index) { return employees.get(index); }

    public void hireEmployee(List<Employee> employees) { this.employees = employees; }
    public void hireEmployee(Employee employee) { this.employees.add(employee); }

    public void fireAllEmployees() { this.employees.clear(); }
    public void fireEmployee(Employee employee) { this.employees.remove(employee); }

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb  .append("-- -- -- -- -- --\n")
            .append(" Name: " + name + "\n")
            .append(" Address: " + address + "\n")
            .append(" Phone: " + phone + "\n")
            .append(" Employees: " + employees.size() + "\n")
            .append("-- -- -- -- -- --");
        return sb.toString();
    }

}
