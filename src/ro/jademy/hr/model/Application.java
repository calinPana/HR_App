package ro.jademy.hr.model;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private List<Employee> employees = new ArrayList<>();
    private List<Salary> salaries = new ArrayList<>();
    private List<Department> departments = new ArrayList<>();
    private List<Title> titles = new ArrayList<>();

    public Application(List<Employee> employees, List<Salary> salaries, List<Department> departments, List<Title> titles) {
        this.employees = employees;
        this.salaries = salaries;
        this.departments = departments;
        this.titles = titles;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }
}
