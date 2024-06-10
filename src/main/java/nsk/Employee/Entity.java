package src.main.java.nsk.Employee;

public class Entity {

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    protected String name;
    protected int age;
    protected String sex;

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    public Entity( String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Entity(String sex) {
        this.name = null;
        this.age = 0;
        this.sex = sex;
    }

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb  .append("-- -- -- -- -- --")
            .append(" Name: ").append(name).append("\n")
            .append(" Age: ").append(age).append("\n")
            .append(" Sex: ").append(sex).append("\n")
            .append("-- -- -- -- -- --");
        return sb.toString();
    }

}
