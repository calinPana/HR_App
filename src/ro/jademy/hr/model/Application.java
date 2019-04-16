package ro.jademy.hr.model;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private List<Employee> employees = new ArrayList<>();

    public Application(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

}
