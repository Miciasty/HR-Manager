package src.main.java.nsk;

import src.main.java.nsk.AppInstance.AppInstance;
import src.main.java.nsk.Company.Company;
import src.main.java.nsk.Employee.Entity;

import java.util.ArrayList;
import java.util.List;

public class Application {

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    private List<Company> companies = new ArrayList<Company>();
    private List<Entity> entities = new ArrayList<>();

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    public Application() {
        AppInstance session = new AppInstance();
    }

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    public void addCompany(Company company) {
        companies.add(company);
    }
    public void removeCompany(Company company) {
        companies.remove(company);
    }
    public List<Company> getCompanies() {
        return companies;
    }
    public Company getCompany(String name) {
        for (Company company : companies) {
            if (company.getName().equals(name)) {
                return company;
            }
        }
        return null;
    }
    public Company getCompany(int id) { return companies.get(id); }

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    public void addEntity(Entity entity) { entities.add(entity); }
    public void removeEntity(Entity entity) { entities.remove(entity); }
    public List<Entity> getEntities() { return entities; }
    public Entity getEntity(int id) { return entities.get(id); }
    public Entity getEntity(String name) {
        for (Entity entity : entities) {
            if (entity.getName().equals(name)) {
                return entity;
            }
        }
        return null;
    }

}
