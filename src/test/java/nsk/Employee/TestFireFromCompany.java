package src.test.java.nsk.Employee;

import org.junit.Before;
import src.main.java.nsk.Application;
import src.main.java.nsk.Company.Company;
import src.main.java.nsk.Employee.Entity;

public class TestFireFromCompany {

    private Application app;

    @Before
    public void init() {
        app = new Application();
        app.addCompany(new Company("Valhalla", "Białystok", "987-654-321"));

        Entity e = new Entity("Thomas", 18, "Male");
    }

}
