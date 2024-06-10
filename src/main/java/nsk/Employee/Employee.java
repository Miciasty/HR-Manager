package src.main.java.nsk.Employee;

import src.main.java.nsk.Company.Position;

public class Employee extends Entity {

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    private Position position = new Position("Assistant", 0);
    private final double salary = getSalary();

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    public Employee(String name, int age, String sex) {
        super(name, age, sex);
    }

    public Employee(String name, int age, String sex, Position position) {
        super(name, age, sex);

        this.position = position;
    }

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    public double getSalary() { return position.getSalary(); }

    public void setPosition(Position position) { this.position = position; }
    public Position getPosition() { return position; }

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb  .append("--\n")
            .append(" Name: ").append(name).append("\n")
            .append(" Age: ").append(age).append("\n")
            .append(" Sex: ").append(sex).append("\n")
            .append(" Position: ").append(position).append("\n")
            .append("--");
        return sb.toString();
    }

}
