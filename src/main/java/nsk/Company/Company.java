package src.main.java.nsk.Company;

import src.main.java.nsk.AppInstance.AppInstance;
import src.main.java.nsk.Employee.Employee;
import src.main.java.nsk.Employee.Entity;

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

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    public List<Employee> getEmployees() {
        try {
            if (!employees.isEmpty()) {
                return employees;
            } else {
                throw new IllegalArgumentException("No employee were found.");
            }
        } catch (Exception e) {
            AppInstance.getApplication().systemError(e);
            return null;
        }
    }
    public Employee getEmployee(int index) {
        try {
            if (employees.get(index) != null) {
                return employees.get(index);
            } else {
                throw new IllegalArgumentException("No employee were found.");
            }
        } catch (Exception e) {
            AppInstance.getApplication().systemError(e);
            return null;
        }
    }

    public void hireEmployee(List<Entity> entities, Position position) {
        try {
            for (Entity entity : entities) {
                if ( !(entity instanceof Employee) ) {
                    this.employees.add(new Employee(
                            entity.getName(),
                            entity.getAge(),
                            entity.getSex(),
                            position
                    ));
                } else if ( employees.contains( (Employee) entity) ) {
                    throw new IllegalArgumentException("The employee is already hired.");
                } else {
                    throw new IllegalArgumentException("The employee is already hired somewhere else.");
                }
            }
        } catch (Exception e) {
            AppInstance.getApplication().systemError(e);
        }
    }
    public void hireEmployee(Entity entity, Position position) {
        try {
            if ( !(entity instanceof Employee) ) {
                this.employees.add(new Employee(
                        entity.getName(),
                        entity.getAge(),
                        entity.getSex(),
                        position
                ));
            } else if ( employees.contains((Employee) entity) ) {
                throw new IllegalArgumentException("Employee is already hired.");
            } else {
                throw new IllegalArgumentException("Employee is already hired somewhere else");
            }
        } catch (Exception e) {
            AppInstance.getApplication().systemError(e);
        }
    }

    public void fireAllEmployees() { this.employees.clear(); }
    public void fireEmployee(Employee employee) {
        try {
            if (!employees.contains(employee)) {
                this.employees.remove(employee);
            } else {
                throw new IllegalArgumentException("No employee was found.");
            }
        } catch (Exception e) {
            AppInstance.getApplication().systemError(e);
        }
    }
    public void fireEmployee(int index) {
        try {
            if (employees.get(index) != null) {
                this.employees.remove(index);
            } else {
                throw new IllegalArgumentException("No employee was found.");
            }
        } catch (Exception e) {
            AppInstance.getApplication().systemError(e);
        }
    }

    public void transferEmployee(Employee employee, Position position) {
        try {
            if (employees.contains(employee)) {
                employee.setPosition( position );
            } else {
                throw new IllegalArgumentException("No employee was found.");
            }
        } catch (Exception e) {
            AppInstance.getApplication().systemError(e);
        }
    }

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb  .append("--\n")
            .append(" Name: " + name + "\n")
            .append(" Address: " + address + "\n")
            .append(" Phone: " + phone + "\n")
            .append(" Employees: " + employees.size() + "\n")
            .append("--");
        return sb.toString();
    }

}
