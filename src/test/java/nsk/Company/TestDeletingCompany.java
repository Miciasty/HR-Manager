package src.test.java.nsk.Company;

import org.junit.Before;
import org.junit.Test;
import src.main.java.nsk.Application;
import src.main.java.nsk.Company.Company;

import static org.junit.Assert.assertEquals;

public class TestDeletingCompany {

    private Application application;

    @Before
    public void init() {
        application = new Application();
        application.addCompany(new Company("Valhalla", "Gdańsk 17", "123-456-789"));
    }

    @Test
    public void testDeletingCompany() {
        Company company = application.getCompany("Valhalla");
        application.removeCompany(company);

        assertEquals(null, application.getCompany("Valhalla"));
    }
}
