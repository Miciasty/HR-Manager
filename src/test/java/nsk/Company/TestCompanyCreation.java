package src.test.java.nsk.Company;

import org.junit.Test;
import src.main.java.nsk.Application;
import src.main.java.nsk.Company.Company;

import static org.junit.Assert.assertEquals;

public class TestCompanyCreation {

    @Test
    public void CreateCompany() {
        Application app = new Application();
        Company company = new Company("Valhalla", "Warsaw 14", "608-253-956");
        app.addCompany(company);

        assertEquals(
        "-- -- -- -- -- --\n" +
                 " Name: Valhalla\n" +
                 " Address: Warsaw 14\n" +
                 " Phone: 608-253-956\n" +
                 " Employees: 0\n" +
                 "-- -- -- -- -- --",

                app.getCompany("Valhalla").toString());
    }

}
