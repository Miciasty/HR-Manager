package src.test.java.nsk.Company.JobPosition;

import org.junit.Before;
import org.junit.Test;
import src.main.java.nsk.Application;
import src.main.java.nsk.Company.Company;
import src.main.java.nsk.Company.Position;
import src.main.java.nsk.Employee.Entity;

import static org.junit.Assert.assertEquals;

public class TestTransfer {

    private Application app;

    @Before
    public void init() {
        app = new Application();
        app.addCompany( new Company("Val", "Warsaw", "123-456-789") );
        Company val = app.getCompany(0);
        val.hireEmployee(new Entity("Jaina", 24, "Woman"), new Position("Assistant", 2000));
    }

    @Test
    public void testTransfer() {
        assertEquals("Jaina", app.getCompany(0).getEmployee(0).getName());
        Company val = app.getCompany(0);

        val.transferEmployee(val.getEmployee(0), new Position("CEO", 14000));
        assertEquals("CEO", val.getEmployee(0).getPosition().getName());
    }

}
