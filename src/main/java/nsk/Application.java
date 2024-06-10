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
        try {
            if (companies.contains(company)) {
                companies.remove(company);
            } else {
                throw new IllegalArgumentException("Company not found");
            }
        } catch (Exception e) {
            this.systemError(e);
        }
    }
    public List<Company> getCompanies() {
        try {
            if (!companies.isEmpty()) {
                return companies;
            } else {
                throw new IllegalArgumentException("Companies not found");
            }
        } catch (Exception e) {
            this.systemError(e);
            return null;
        }
    }
    public Company getCompany(String name) {
        try {
            for (Company company : companies) {
                if (company.getName().equals(name)) {
                    return company;
                }
            }
            throw new IllegalArgumentException("Company not found");

        } catch (Exception e) {
            this.systemError(e);
            return null;
        }
    }
    public Company getCompany(int id) {
        try {
            if (companies.get(id) != null) {
                return companies.get(id);
            } else {
                throw new IllegalArgumentException("Company not found");
            }
        } catch (Exception e) {
            this.systemError(e);
            return null;
        }
    }

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    public void addEntity(Entity entity) { entities.add(entity); }
    public void removeEntity(Entity entity) {
        try {
            if (entities.contains(entity)) {
                entities.remove(entity);
            } else {
                throw new IllegalArgumentException("Entity not found");
            }
        } catch (Exception e) {
            this.systemError(e);
        }
    }
    public List<Entity> getEntities() {
        try {
            if (!entities.isEmpty()) {
                return entities;
            } else {
                throw new IllegalArgumentException("Entities not found");
            }
        } catch (Exception e) {
            this.systemError(e);
            return null;
        }
    }
    public Entity getEntity(int id) {
        try {
            if (entities.contains(id)) {
                return entities.get(id);
            } else {
                throw new IllegalArgumentException("Entity not found");
            }
        } catch (Exception e) {
            this.systemError(e);
            return null;
        }
    }
    public Entity getEntity(String name) {
        try {
            for (Entity entity : entities) {
                if (entity.getName().equals(name)) {
                    return entity;
                }
            }
            throw new IllegalArgumentException("Entity not found");
        } catch (Exception e) {
            this.systemError(e);
            return null;
        }
    }

    // -- -- -- -- // -- -- -- -- // -- -- -- -- //

    public void systemError(Exception e) {
        System.out.println(e.getMessage());
    }
}
