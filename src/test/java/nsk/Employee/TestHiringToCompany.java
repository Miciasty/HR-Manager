package src.test.java.nsk.Employee;

import org.junit.Before;
import org.junit.Test;
import src.main.java.nsk.Application;
import src.main.java.nsk.Company.Company;
import src.main.java.nsk.Company.Position;
import src.main.java.nsk.Employee.Entity;

import static org.junit.Assert.assertEquals;

public class TestHiringToCompany {

    private Application app;

    @Before
    public void init() {
        app = new Application();
        app.addCompany( new Company("Val", "Gdańsk", "123-456-789") );
    }

    @Test
    public void testHiringToCompany() {
        Entity e = new Entity("Gson", 298, "Unknown");

        Company v = app.getCompany("Val");
        v.hireEmployee(e, new Position("HR Manager", 3750));

        assertEquals(3750, v.getEmployee(0).getPosition().getSalary(), 0.01 );
    }
}
