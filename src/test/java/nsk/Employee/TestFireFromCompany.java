package src.test.java.nsk.Employee;

import org.junit.Before;
import org.junit.Test;
import src.main.java.nsk.Application;
import src.main.java.nsk.Company.Company;
import src.main.java.nsk.Company.Position;
import src.main.java.nsk.Employee.Entity;

import static org.junit.Assert.assertEquals;

public class TestFireFromCompany {

    private Application app;

    @Before
    public void init() {
        app = new Application();
        app.addCompany(new Company("Valhalla", "Białystok", "987-654-321"));

        Entity e = new Entity("Thomas", 18, "Male");

        Company v = app.getCompany("Valhalla");
        v.hireEmployee(e, new Position("HR Manager", 7500));
    }

    @Test
    public void testFireFromCompany() {
        Company v = app.getCompany("Valhalla");

        assertEquals(
                "--\n" +
                " Name: Thomas\n" +
                " Age: 18\n" +
                " Sex: Male\n" +
                " Position: HR Manager, salary: 7500.0\n" +
                "--",
                v.getEmployee(0).toString());

        v.fireEmployee(0);
        assertEquals(null, v.getEmployee(0));
    }

}
